/**
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package net.sf.springderby;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/**
 * {@link OutputStream} implementation that redirects to a {@link Writer}.
 * 
 * @author Andreas Veithen
 * @version $Id$
 */
public class WriterOutputStream extends OutputStream {
	private final Writer writer;
	private final CharsetDecoder decoder;
	private final ByteBuffer decoderIn = ByteBuffer.allocate(128);
	private final CharBuffer decoderOut = CharBuffer.allocate(128);
	
	public WriterOutputStream(Writer writer, Charset charset) {
		this.writer = writer;
		decoder = charset.newDecoder();
		decoder.onMalformedInput(CodingErrorAction.REPLACE);
		decoder.onUnmappableCharacter(CodingErrorAction.REPLACE);
		decoder.replaceWith("?");
	}

	public WriterOutputStream(Writer writer, String charset) {
		this(writer, Charset.forName(charset));
	}
	
	@Override
	public void write(byte[] bytes, int offset, int length) throws IOException {
		while (length > 0) {
			int c = Math.min(length, decoderIn.remaining());
			decoderIn.put(bytes, offset, c);
			processInput(false);
			length -= c;
			offset += c;
		}
	}

	@Override
	public void write(byte[] bytes) throws IOException {
		write(bytes, 0, bytes.length);
	}

	@Override
	public void write(int b) throws IOException {
		write(new byte[] { (byte)b }, 0, 1);
	}
	
	@Override
	public void close() throws IOException {
		processInput(true);
		writer.close();
	}
	
	private void processInput(boolean endOfInput) throws IOException {
		decoderIn.flip();
		CoderResult coderResult;
		do {
			coderResult = decoder.decode(decoderIn, decoderOut, endOfInput);
			// The decoder is configured to replace malformed input and unmappable characters
			assert !coderResult.isError();
			writer.write(decoderOut.array(), 0, decoderOut.position());
			decoderOut.rewind();
		} while (coderResult.isOverflow());
		decoderIn.compact();
	}
}
