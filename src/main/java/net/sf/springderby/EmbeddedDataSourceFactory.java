package net.sf.springderby;

import java.util.Iterator;
import java.util.List;

import org.apache.derby.jdbc.EmbeddedDataSource;
import org.apache.derby.tools.ij;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmbeddedDataSourceFactory implements InitializingBean, DisposableBean, FactoryBean {
	private boolean create;
	
	private String databaseName;
	private String user;
	private String scriptEncoding = "UTF-8";
	private List schemaCreationScripts;
	private EmbeddedDataSource dataSource;
	
	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}
	
	public void setUser(String user) {
		this.user = user;
	}

	public void setCreate(boolean create) {
		this.create = create;
	}

	public void setScriptEncoding(String scriptEncoding) {
		this.scriptEncoding = scriptEncoding;
	}

	public void setSchemaCreationScripts(List schemaCreationScripts) {
		this.schemaCreationScripts = schemaCreationScripts;
	}

	public void afterPropertiesSet() throws Exception {
		dataSource = new EmbeddedDataSource();
		dataSource.setDatabaseName(databaseName);
		if (create) {
			dataSource.setCreateDatabase("create");
		}
		if (schemaCreationScripts != null) {
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			if (jdbcTemplate.queryForInt("SELECT COUNT(*) FROM SYS.SYSSCHEMAS WHERE SCHEMANAME=?", new Object[] { user.toUpperCase() }) == 0) {
				
				for (Iterator it = schemaCreationScripts.iterator(); it.hasNext(); ) {
					Resource scriptResource = (Resource)it.next();
					
					
				}
				// runScript returns the number of SQLExceptions thrown during the execution
				ij.runScript(arg0, arg1, arg2, arg3, arg4);
			}
		}
	}

	public void destroy() throws Exception {
		dataSource.setShutdownDatabase("shutdown");
		// getConnection must be called to actually perform the shutdown
		dataSource.getConnection();
	}

	public Class getObjectType() {
		return EmbeddedDataSourceFactory.class;
	}

	public boolean isSingleton() {
		return true;
	}

	public Object getObject() throws Exception {
		return dataSource;
	}
}
