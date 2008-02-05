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

/**
 * An action that can be executed on an online database, i.e. when
 * connected to the database.
 * 
 * @author Andreas Veithen
 * @version $Id$
 */
public interface OnlineAction {
	/**
	 * Execute the action on the specified database.
	 * 
	 * @param context an {@link OnlineActionContext} object encapsulating
	 *        the required information to execute the action
	 * @throws Exception if an error occurs
	 */
	void execute(OnlineActionContext context) throws Exception;
}
