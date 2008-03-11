package net.sf.springderby;

import java.io.StringWriter;

import junit.framework.TestCase;

public class WriterOutputStreamTest extends TestCase {
	public void testUndecodable() throws Exception {
		StringWriter sw = new StringWriter();
		WriterOutputStream out = new WriterOutputStream(sw, "ASCII");
		out.write(new byte[] { 'A', -1, 'B' });
		out.close();
		assertEquals("A?B", sw.toString());
	}
}
