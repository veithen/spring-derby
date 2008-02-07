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

public enum OnNullInput {
	/**
	 * Specifies that the function is not invoked if any of the input arguments is
	 * null. The result is the null value.
	 */
	RETURNS_NULL("RETURNS NULL ON NULL INPUT"),
	
	/**
	 * Specifies that the function is invoked if any or all input arguments are
	 * null. This specification means that the function must be coded to test
	 * for null argument values. The function can return a null or non-null value.
	 */
	CALLED("CALLED ON NULL INPUT");
	
	private final String sql;
	
	OnNullInput(String sql) {
		this.sql = sql;
	}

	public String getSql() {
		return sql;
	}
}
