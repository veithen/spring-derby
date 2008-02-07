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
package net.sf.springderby.proc.annotation;

/**
 * Enumeration that specifies SQL data access levels for functions and stored
 * procedures.
 * 
 * @author Andreas Veithen
 * @version $Id$
 */
public enum DataAccessLevel {
	/**
	 * Indicates that the function or stored procedure cannot execute
	 * any SQL statements.
	 */
	NO_SQL("NO SQL"),
	
	/**
	 * Indicates that SQL statements that neither read nor modify SQL data
	 * can be executed by the function or stored procedure.
	 */
	CONTAINS_SQL("CONTAINS SQL"),
	
	/**
	 * Indicates that some SQL statements that do not modify SQL data
	 * can be included in the function or stored procedure.
	 */
	READS_SQL_DATA("READS SQL DATA"),
	
	/**
	 * Indicates that the stored procedure can execute any SQL statement
	 * except statements that are not supported in stored procedures.
	 * This data access level is not applicable to functions.
	 */
	MODIFIES_SQL_DATA("MODIFIES SQL DATA");
	
	private final String sql;
	
	DataAccessLevel(String sql) {
		this.sql = sql;
	}

	public String getSql() {
		return sql;
	}
}
