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

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DB2DateTimeFunctions {
	// DAYOFMONTH
	// The DAYOFMONTH function returns the day part of a value. The function is similar to the DAY function, except DAYOFMONTH does not support a date or timestamp duration as an argument.
	// if the argument is null, the result is the null value.
	
	// DAYOFWEEK
	// The DAYOFWEEK function returns an integer in the range of 1 to 7 that represents the day of the week where 1 is Sunday and 7 is Saturday. The DAYOFWEEK function is similar to the DAYOFWEEK_ISO function.
	// if the argument is null, the result is the null value.
	
	// DAYOFWEEK_ISO
	// The DAYOFWEEK_ISO function returns an integer in the range of 1 to 7 that represents the day of the week, where 1 is Monday and 7 is Sunday. The DAYOFWEEK_ISO function is similar to the DAYOFWEEK function.
	// if the argument is null, the result is the null value.
	
	// DAYOFYEAR
	// The DAYOFYEAR function returns an integer in the range of 1 to 366 that represents the day of the year where 1 is January 1.
	// if the argument is null, the result is the null value.
	
	// LAST_DAY
	// The LAST_DAY scalar function returns a date that represents the last day of the month of the date argument.
	// if the value of date-expression is null, the result is the null value.
	
	/**
	 * Emulation of the DB2 <tt>WEEK</tt> function.
	 * The function is defined as follows:
	 * <blockquote>
	 * The WEEK function returns an integer in the range of 1 to 54 that represents the week
	 * of the year. The week starts with Sunday, and January 1 is always in the first week.
	 * [...] if the argument is null, the result is the null value.
	 * </blockquote>
	 * @param date the date value
	 * @return the week of the year or <code>null</code> if <code>date</code> was <code>null</code>
	 */
	public static Integer week(Date date) {
		if (date == null) {
			return null;
		} else {
			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			calendar.setFirstDayOfWeek(Calendar.SUNDAY);
			calendar.setMinimalDaysInFirstWeek(1);
			return new Integer(calendar.get(Calendar.WEEK_OF_YEAR));
		}
	}
	
	// WEEK_ISO
	// The WEEK_ISO function returns an integer in the range of 1 to 53 that represents the week of the year. The week starts with Monday and includes 7 days. Week 1 is the first week of the year to contain a Thursday, which is equivalent to the first week containing January 4. Thus, it is possible to have up to 3 days at the beginning of the year appear as the last week of the previous year, or to have up to 3 days at the end of a year appear as the first week of the next year.
	// if the argument is null, the result is the null value.
}
