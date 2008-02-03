package net.sf.springderby.proc;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.sql.DataSource;

import junit.framework.TestCase;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class DB2DateTimeFunctionsTest extends TestCase {
	public void test() throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/net/sf/springderby/proc/testContext.xml");
		try {
			JdbcTemplate jdbcTemplate = new JdbcTemplate((DataSource)context.getBean("dataSource"));
			
			// Test behaviour with NULL input
			assertEquals(null, jdbcTemplate.queryForObject("SELECT DAYOFWEEK(NULL) FROM SYSIBM.SYSDUMMY1", Integer.class));
			assertEquals(null, jdbcTemplate.queryForObject("SELECT DAYOFWEEK_ISO(NULL) FROM SYSIBM.SYSDUMMY1", Integer.class));
			assertEquals(null, jdbcTemplate.queryForObject("SELECT DAYOFYEAR(NULL) FROM SYSIBM.SYSDUMMY1", Integer.class));
			assertEquals(null, jdbcTemplate.queryForObject("SELECT LAST_DAY(NULL) FROM SYSIBM.SYSDUMMY1", Integer.class));
			assertEquals(null, jdbcTemplate.queryForObject("SELECT WEEK(NULL) FROM SYSIBM.SYSDUMMY1", Integer.class));
			assertEquals(null, jdbcTemplate.queryForObject("SELECT WEEK_ISO(NULL) FROM SYSIBM.SYSDUMMY1", Integer.class));
			
			// Test examples from DB2 manual
			assertEquals(1, jdbcTemplate.queryForInt("SELECT DAYOFWEEK(CAST('10/11/1998' AS DATE)) FROM SYSIBM.SYSDUMMY1"));
			assertEquals(7, jdbcTemplate.queryForInt("SELECT DAYOFWEEK_ISO(CAST('10/11/1998' AS DATE)) FROM SYSIBM.SYSDUMMY1"));
			{
				Date lastDay = (Date)jdbcTemplate.queryForObject("SELECT LAST_DAY(CAST('1965-07-07' AS DATE)) FROM SYSIBM.SYSDUMMY1", Date.class);
				GregorianCalendar cal = new GregorianCalendar();
				cal.setTime(lastDay);
				assertEquals(1965, cal.get(Calendar.YEAR));
				assertEquals(Calendar.JULY, cal.get(Calendar.MONTH));
				assertEquals(31, cal.get(Calendar.DAY_OF_MONTH));
			}
			assertEquals(52, jdbcTemplate.queryForInt("SELECT WEEK_ISO(CAST('2003-12-28' AS DATE)) FROM SYSIBM.SYSDUMMY1"));
			assertEquals(1, jdbcTemplate.queryForInt("SELECT WEEK_ISO(CAST('2003-12-31' AS DATE)) FROM SYSIBM.SYSDUMMY1"));
			assertEquals(1, jdbcTemplate.queryForInt("SELECT WEEK_ISO(CAST('2004-01-01' AS DATE)) FROM SYSIBM.SYSDUMMY1"));
			assertEquals(53, jdbcTemplate.queryForInt("SELECT WEEK_ISO(CAST('2005-01-01' AS DATE)) FROM SYSIBM.SYSDUMMY1"));
			assertEquals(1, jdbcTemplate.queryForInt("SELECT WEEK_ISO(CAST('2005-01-04' AS DATE)) FROM SYSIBM.SYSDUMMY1"));
			assertEquals(52, jdbcTemplate.queryForInt("SELECT WEEK_ISO(CAST('2005-12-31' AS DATE)) FROM SYSIBM.SYSDUMMY1"));
			assertEquals(52, jdbcTemplate.queryForInt("SELECT WEEK_ISO(CAST('2006-01-01' AS DATE)) FROM SYSIBM.SYSDUMMY1"));
			assertEquals(1, jdbcTemplate.queryForInt("SELECT WEEK_ISO(CAST('2006-01-03' AS DATE)) FROM SYSIBM.SYSDUMMY1"));
		}
		finally {
			context.destroy();
		}
	}
}
