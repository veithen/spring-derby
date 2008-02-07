package net.sf.springderby;

import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;

public class SqlScriptExecutionSupport {
	private static SqlScriptExecutor defaultSqlScriptExecutor;
	
	private SqlScriptExecutor sqlScriptExecutor;

	public SqlScriptExecutor getSqlScriptExecutor() {
		if (sqlScriptExecutor == null) {
			synchronized (SqlScriptExecutionSupport.class) {
				if (defaultSqlScriptExecutor == null) {
					Class<?> ijClass;
					try {
						ijClass = Class.forName("org.apache.derby.tools.ij");
					}
					catch (ClassNotFoundException ex) {
						ijClass = null;
					}
					if (ijClass != null) {
						try {
							ijClass.getMethod("runScript", new Class[] { Connection.class, InputStream.class, String.class, OutputStream.class, String.class });
							defaultSqlScriptExecutor = new IjSqlScriptExecutor();
						}
						catch (NoSuchMethodException ex) {
							
						}
					}
				}
				sqlScriptExecutor = defaultSqlScriptExecutor;
			}
		}
		return sqlScriptExecutor;
	}

	public void setSqlScriptExecutor(SqlScriptExecutor sqlScriptExecutor) {
		this.sqlScriptExecutor = sqlScriptExecutor;
	}
}
