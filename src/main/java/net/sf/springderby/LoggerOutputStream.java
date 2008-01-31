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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

import org.apache.commons.logging.Log;

/**
 * {@link OutputStream} implementation that redirects to a logger.
 * 
 * @author Andreas Veithen
 */
public class LoggerOutputStream extends OutputStream {
	private final Log log;
	private final String charset;
	private final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
	
	public LoggerOutputStream(Log log, String charset) {
		this.log = log;
		this.charset = charset;
	}

	public void write(byte[] bytes, int off, int len) throws IOException {
		int start = off;
		while (len > 0) {
			byte b = bytes[off];
			if (b == '\n') {
				buffer.write(bytes, start, off-start);
				flushBuffer();
				start = off+1;
			}
			off++;
			len--;
		}
		buffer.write(bytes, start, off-start);
	}

	public void write(byte[] bytes) throws IOException {
		write(bytes, 0, bytes.length);
	}

	public void write(int b) throws IOException {
		write(new byte[] { (byte)b }, 0, 1);
	}
	
	public void close() throws IOException {
		flushBuffer();
	}

	private void flushBuffer() throws UnsupportedEncodingException {
		log.info(new String(buffer.toByteArray(), charset));
		buffer.reset();
	}
}
