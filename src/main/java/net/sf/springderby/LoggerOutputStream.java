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

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

import org.apache.commons.logging.Log;

/**
 * {@link OutputStream} implementation that redirects to a logger.
 * 
 * @author Andreas Veithen
 */
public class LoggerOutputStream extends OutputStream {
	private final Log log;
	private final CharsetDecoder decoder;
	private final String endOfLine;
	private final ByteBuffer decoderIn = ByteBuffer.allocate(128);
	private final CharBuffer decoderOut = CharBuffer.allocate(128);
	private final StringBuffer lineBuffer = new StringBuffer();
	private int endOfLineMatch;
	
	public LoggerOutputStream(Log log, Charset charset, String endOfLine) {
		this.log = log;
		decoder = charset.newDecoder();
		decoder.onMalformedInput(CodingErrorAction.REPLACE);
		decoder.onUnmappableCharacter(CodingErrorAction.REPLACE);
		decoder.replaceWith("?");
		this.endOfLine = endOfLine;
	}

	public LoggerOutputStream(Log log, Charset charset) {
		this(log, charset, System.getProperty( "line.separator" ));
	}

	public LoggerOutputStream(Log log, String charset, String endOfLine) {
		this(log, Charset.forName(charset), endOfLine);
	}
	
	public LoggerOutputStream(Log log, String charset) {
		this(log, Charset.forName(charset));
	}
	
	public void write(byte[] bytes, int offset, int length) {
		while (length > 0) {
			int c = Math.min(length, decoderIn.remaining());
			decoderIn.put(bytes, offset, c);
			processInput(false);
			length -= c;
			offset += c;
		}
	}

	public void write(byte[] bytes) {
		write(bytes, 0, bytes.length);
	}

	public void write(int b) {
		write(new byte[] { (byte)b }, 0, 1);
	}
	
	public void close() {
		processInput(true);
		if (lineBuffer.length() > 0) {
			flushLineBuffer();
		}
	}
	
	private void processInput(boolean endOfInput) {
		decoderIn.flip();
		CoderResult coderResult;
		do {
			coderResult = decoder.decode(decoderIn, decoderOut, endOfInput);
			// The decoder is configured to replace malformed input and unmappable characters
			assert !coderResult.isError();
			int outLength = decoderOut.position();
			char[] outArray = decoderOut.array();
			int start = 0;
			for (int i=0; i<outLength; i++) {
				if (outArray[i] == endOfLine.charAt(endOfLineMatch)) {
					endOfLineMatch++;
					if (endOfLineMatch == endOfLine.length()) {
						lineBuffer.append(outArray, start, i-start+1);
						lineBuffer.setLength(lineBuffer.length()-endOfLine.length());
						flushLineBuffer();
						start = i+1;
						endOfLineMatch = 0;
					}
				} else {
					endOfLineMatch = 0;
				}
			}
			lineBuffer.append(outArray, start, outLength-start);
			decoderOut.rewind();
		} while (coderResult.isOverflow());
		decoderIn.compact();
	}
	
	private void flushLineBuffer() {
		log.info(lineBuffer.toString());
		lineBuffer.setLength(0);
	}
}
