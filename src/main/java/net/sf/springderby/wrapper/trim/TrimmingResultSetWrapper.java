package net.sf.springderby.wrapper.trim;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.sf.springderby.wrapper.ResultSetWrapper;

public class TrimmingResultSetWrapper extends ResultSetWrapper {
	private final static Log log = LogFactory.getLog(TrimmingResultSetWrapper.class);
	
	private Set<String> charColumns;
	private boolean[] isCharColumn;
	
	public TrimmingResultSetWrapper(ResultSet target) {
		super(target);
	}
	
	private void fetchCharColumns() throws SQLException {
		if (charColumns == null) {
			ResultSetMetaData metadata = getMetaData();
			int columnCount = metadata.getColumnCount();
			charColumns = new HashSet<String>();
			isCharColumn = new boolean[columnCount];
			for (int i = 1; i < columnCount; i++) {
				if (metadata.getColumnType(i) == Types.CHAR) {
					charColumns.add(metadata.getColumnName(i).toUpperCase());
					isCharColumn[i-1] = true;
				}
			}
			if (log.isDebugEnabled()) {
				log.debug("CHAR columns: " + charColumns);
			}
		}
	}
	
	private boolean isCharColumn(int columnIndex) throws SQLException {
		fetchCharColumns();
		return isCharColumn[columnIndex-1];
	}
	
	private boolean isCharColumn(String columnName) throws SQLException {
		fetchCharColumns();
		return charColumns.contains(columnName.toUpperCase());
	}
	
	private String trim(String string) {
		int length = string.length();
		int trimmedLength = length;
		while (trimmedLength > 0 && string.charAt(trimmedLength-1) == ' ') {
			trimmedLength--;
		}
		return trimmedLength == length ? string : string.substring(0, trimmedLength);
	}
	
	@Override
	public Object getObject(int columnIndex) throws SQLException {
		Object result = super.getObject(columnIndex);
		return result == null || !(result instanceof String) ? result : (isCharColumn(columnIndex) ? trim((String)result) : result);
	}

	@Override
	public Object getObject(String columnName) throws SQLException {
		Object result = super.getObject(columnName);
		return result == null || !(result instanceof String) ? result : (isCharColumn(columnName) ? trim((String)result) : result);
	}

	@Override
	public String getString(int columnIndex) throws SQLException {
		String result = super.getString(columnIndex);
		return result == null ? null : (isCharColumn(columnIndex) ? trim(result) : result);
	}

	@Override
	public String getString(String columnName) throws SQLException {
		String result = super.getString(columnName);
		return result == null ? null : (isCharColumn(columnName) ? trim(result) : result);
	}
}
