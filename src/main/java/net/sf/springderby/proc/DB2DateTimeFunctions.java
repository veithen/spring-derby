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

/**
 * Emulation of DB2 date and time functions.
 * <p>
 * This class contains a set of static methods that emulate various DB2 date and
 * time functions.
 * 
 * @author Andreas Veithen
 */
public class DB2DateTimeFunctions {
	private DB2DateTimeFunctions() {}
	
	/**
	 * Emulation of the DB2 <tt>DAYOFWEEK</tt> function.
	 * This function is defined as follows:
	 * <blockquote>
	 * The DAYOFWEEK function returns an integer in the range of 1 to 7 that represents the
	 * day of the week where 1 is Sunday and 7 is Saturday.
	 * [...] if the argument is null, the result is the null value.
	 * </blockquote>
	 * @param date the date value
	 * @return the day of the week or <code>null</code> if <code>date</code> is <code>null</code>
	 */
	public static Integer dayOfWeek(Date date) {
		if (date == null) {
			return null;
		} else {
			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			return new Integer(calendar.get(Calendar.DAY_OF_WEEK));
		}
	}
	
	/**
	 * Emulation of the DB2 <tt>DAYOFWEEK_ISO</tt> function.
	 * This function is defined as follows:
	 * <blockquote>
	 * The DAYOFWEEK_ISO function returns an integer in the range of 1 to 7 that
	 * represents the day of the week, where 1 is Monday and 7 is Sunday.
	 * [...] if the argument is null, the result is the null value.
	 * @param date the date value
	 * @return the day of the week or <code>null</code> if <code>date</code> is <code>null</code>
	 */
	public static Integer dayOfWeekIso(Date date) {
		if (date == null) {
			return null;
		} else {
			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
			return new Integer(dayOfWeek == 1 ? 7 : dayOfWeek-1);
		}
	}
	
	/**
	 * Emulation of the DB2 <tt>DAYOFYEAR</tt> function.
	 * This function is defined as follows:
	 * <blockquote>
	 * The DAYOFYEAR function returns an integer in the range of 1 to 366 that
	 * represents the day of the year where 1 is January 1.
	 * [...] if the argument is null, the result is the null value.
	 * </blockquote>
	 * @param date the date value
	 * @return the day of the year or <code>null</code> if <code>date</code> is <code>null</code>
	 */
	public static Integer dayOfYear(Date date) {
		if (date == null) {
			return null;
		} else {
			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			return new Integer(calendar.get(Calendar.DAY_OF_YEAR));
		}
	}
	
	/**
	 * Emulation of the DB2 <tt>LAST_DAY</tt> function.
	 * This function is defined as follows:
	 * <blockquote>
	 * The LAST_DAY scalar function returns a date that represents the last day
	 * of the month of the date argument.
	 * [...] if the value of date-expression is null, the result is the null value.
	 * </blockquote>
	 * @param date the date value
	 * @return the last day of the month or <code>null</code> if <code>date</code> is <code>null</code>
	 */
	public static Date lastDay(Date date) {
		if (date == null) {
			return null;
		} else {
			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			calendar.set(Calendar.DAY_OF_MONTH, 1);
			calendar.add(Calendar.MONTH, 1);
			calendar.add(Calendar.DAY_OF_MONTH, -1);
			return new Date(calendar.getTimeInMillis());
		}
	}
	
	/**
	 * Emulation of the DB2 <tt>WEEK</tt> function.
	 * This function is defined as follows:
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
	
	/**
	 * Emulation of the DB2 <tt>WEEK_ISO</tt> function.
	 * This function is defined as follows:
	 * <blockquote>
	 * The WEEK_ISO function returns an integer in the range of 1 to 53 that represents the week
	 * of the year. The week starts with Monday and includes 7 days. Week 1 is the first week
	 * of the year to contain a Thursday, which is equivalent to the first week containing
	 * January 4. Thus, it is possible to have up to 3 days at the beginning of the year appear
	 * as the last week of the previous year, or to have up to 3 days at the end of a year
	 * appear as the first week of the next year.
	 * [...] if the argument is null, the result is the null value.
	 * </blockquote>
	 * @param date the date value
	 * @return the week of the year or <code>null</code> if <code>date</code> was <code>null</code>
	 */
	public static Integer weekIso(Date date) {
		if (date == null) {
			return null;
		} else {
			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			calendar.setFirstDayOfWeek(Calendar.MONDAY);
			calendar.setMinimalDaysInFirstWeek(4);
			return new Integer(calendar.get(Calendar.WEEK_OF_YEAR));
		}
	}
}
