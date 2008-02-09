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

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

import junit.framework.TestCase;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class EmbeddedDataSourceFactoryTest extends TestCase {
	/**
	 * Check that in case the schema creation scripts fail the database is shutdown and
	 * the afterShutdownActions are executed.
	 */
	public void testSchemaCreationFailure() {
		try {
			new ClassPathXmlApplicationContext("/net/sf/springderby/failureTestContext.xml");
			fail("Expected exception");
		}
		catch (BeanCreationException ex) {
			assertFalse(new File("target/failureTestDB").exists());
		}
	}
	
	public void testTrimChar() throws Exception {
		EmbeddedDataSourceFactory factory = new EmbeddedDataSourceFactory();
		factory.setDatabaseName("target/testDB");
		factory.setUser("test");
		factory.setCreate(true);
		factory.setTrimChar(true);
		factory.setBeforeStartupAction(new DeleteDatabaseAction());
		ExecuteSqlScriptsAction action = new ExecuteSqlScriptsAction();
		action.setScript(new ClassPathResource("/net/sf/springderby/trimCharTest.sql"));
		factory.setAfterCreationAction(action);
		factory.setAfterShutdownAction(new DeleteDatabaseAction());
		factory.afterPropertiesSet();
		try {
			DataSource dataSource = (DataSource)factory.getObject();
			Connection connection = dataSource.getConnection();
			try {
				Statement statement = connection.createStatement();
				try {
					ResultSet rs = statement.executeQuery("SELECT * FROM TEST");
					rs.next();
					assertEquals("test", rs.getString(2));
					assertEquals("test", rs.getString("CHAR_COL"));
					assertEquals("test", rs.getObject(2));
					assertEquals("test", rs.getObject("CHAR_COL"));
				}
				finally {
					statement.close();
				}
			}
			finally {
				connection.close();
			}
		}
		finally {
			factory.destroy();
		}
	}
}
