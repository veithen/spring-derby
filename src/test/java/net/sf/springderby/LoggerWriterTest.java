package net.sf.springderby;

import java.io.Writer;

import junit.framework.TestCase;

public class LoggerWriterTest extends TestCase {
	private final static String[] testStrings =
		{
			"Vestibulum semper. Nullam non odio. Aliquam quam.",
			"Mauris eu lectus non nunc auctor ullamcorper.",
			"Sed tincidunt molestie enim. Phasellus lobortis justo sit amet quam.",
			"Duis nulla erat, varius a, cursus in, tempor sollicitudin, mauris.",
			"Aliquam mi velit, consectetuer mattis, consequat tristique, pulvinar ac, nisl.",
			"Aliquam mattis vehicula elit. Proin quis leo sed tellus scelerisque molestie.",
			"Quisque luctus. Integer mattis. Donec id augue sed leo aliquam egestas.",
			"Quisque in sem. Donec dictum enim in dolor. Praesent non erat.",
			"Nulla ultrices vestibulum quam."
		};
	
	public void testEndOfLine(String endOfLine) throws Exception {
		TestLog log = new TestLog();
		Writer out = new LoggerWriter(log, endOfLine);
		for (int i=0; i<testStrings.length; i++) {
			out.write(testStrings[i]);
			out.write(endOfLine);
		}
		out.close();
		for (int i=0; i<testStrings.length; i++) {
			assertEquals(testStrings[i], log.pop());
		}
		assertFalse(log.hasMessages());
	}
	
	public void testUnixEndOfLine() throws Exception {
		testEndOfLine("\n");
	}
	
	public void testWindowsEndOfLine() throws Exception {
		testEndOfLine("\r\n");
	}
	
	public void testNoEndOfLineOnLastLine() throws Exception {
		TestLog log = new TestLog();
		Writer out = new LoggerWriter(log, "\n");
		out.write("TEST1\n");
		out.write("TEST2");
		out.close();
		assertEquals("TEST1", log.pop());
		assertEquals("TEST2", log.pop());
		assertFalse(log.hasMessages());
	}
}
