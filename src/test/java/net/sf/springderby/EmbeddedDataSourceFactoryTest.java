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

import junit.framework.TestCase;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
}
