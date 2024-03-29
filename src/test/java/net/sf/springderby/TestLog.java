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

import java.util.LinkedList;

import org.apache.commons.logging.impl.SimpleLog;

/**
 * Mock log implementation that stores messages in memory.
 * 
 * @author Andreas Veithen
 * @version $Id$
 */
public class TestLog extends SimpleLog {
	private static final long serialVersionUID = 2895730608495418482L;
	
	private final LinkedList<Object> messages = new LinkedList<Object>();
	
	public TestLog() {
		super("TestLog");
	}

	@Override
	protected void log(int type, Object message, Throwable t) {
		messages.add(message);
	}
	
	public Object pop() {
		return messages.removeFirst();
	}
	
	public boolean hasMessages() {
		return !messages.isEmpty();
	}
}
