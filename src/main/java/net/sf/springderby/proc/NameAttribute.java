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
package net.sf.springderby.proc;

/**
 * SQL name of a stored procedure or function.
 * 
 * @author Andreas Veithen
 * @version $Id$
 */
public class NameAttribute implements ProcedureAttribute {
	private final String name;
	
	public NameAttribute(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
