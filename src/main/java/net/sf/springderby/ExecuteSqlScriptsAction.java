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
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.core.io.Resource;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ConnectionCallback;

/**
 * Online action that executes a set of SQL scripts.
 * 
 * @author Andreas Veithen
 * @version $Id$
 */
public class ExecuteSqlScriptsAction implements OnlineAction, ConnectionCallback {
	private final static Log log = LogFactory.getLog(ExecuteSqlScriptsAction.class);
	
	private final SqlScriptExecutionSupport sqlScriptExecutionSupport = new SqlScriptExecutionSupport();
	
	private String encoding = "UTF-8";
	private List/*<Resource>*/ scripts;
	
	public void setSqlScriptExecutor(SqlScriptExecutor sqlScriptExecutor) {
		sqlScriptExecutionSupport.setSqlScriptExecutor(sqlScriptExecutor);
	}

	/**
	 * Set the encoding of the scripts.
	 * The default value for this property is UTF-8.
	 * 
	 * @param encoding the encoding
	 */
	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}
	
	/**
	 * Set the list of scripts to be executed by this action.
	 * 
	 * @param scripts a list of {@link Resource} objects identifying the scripts to execute
	 */
	public void setScripts(List scripts) {
		this.scripts = scripts;
	}

	public void execute(OnlineActionContext context) throws Exception {
		context.getJdbcTemplate().execute(this);
	}
	
	public Object doInConnection(Connection connection) throws SQLException, DataAccessException {
		for (Iterator it = scripts.iterator(); it.hasNext(); ) {
			Resource resource = (Resource)it.next();
			try {
				sqlScriptExecutionSupport.getSqlScriptExecutor().executeScript(connection, resource, encoding);
			}
			catch (IOException ex) {
				// TODO: this exception is no longer appropriate
				throw new SchemaCreationException("Failed to read script " + resource.getFilename(), ex);
			}
		}
		return null;
	}
}
