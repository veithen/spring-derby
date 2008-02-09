package net.sf.springderby.wrapper;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Map;

public class ResultSetWrapper implements ResultSet {
	private final ResultSet parent;

	public ResultSetWrapper(ResultSet target) {
		this.parent = target;
	}
	
	/**
	 * Delegate method for {@link ResultSet#absolute(int)}.
	 */
	public boolean absolute(int row) throws SQLException {
		return parent.absolute(row);
	}
	
	/**
	 * Delegate method for {@link ResultSet#afterLast()}.
	 */
	public void afterLast() throws SQLException {
		parent.afterLast();
	}
	
	/**
	 * Delegate method for {@link ResultSet#beforeFirst()}.
	 */
	public void beforeFirst() throws SQLException {
		parent.beforeFirst();
	}
	
	/**
	 * Delegate method for {@link ResultSet#cancelRowUpdates()}.
	 */
	public void cancelRowUpdates() throws SQLException {
		parent.cancelRowUpdates();
	}
	
	/**
	 * Delegate method for {@link ResultSet#clearWarnings()}.
	 */
	public void clearWarnings() throws SQLException {
		parent.clearWarnings();
	}
	
	/**
	 * Delegate method for {@link ResultSet#close()}.
	 */
	public void close() throws SQLException {
		parent.close();
	}
	
	/**
	 * Delegate method for {@link ResultSet#deleteRow()}.
	 */
	public void deleteRow() throws SQLException {
		parent.deleteRow();
	}
	
	/**
	 * Delegate method for {@link ResultSet#findColumn(String)}.
	 */
	public int findColumn(String columnName) throws SQLException {
		return parent.findColumn(columnName);
	}
	
	/**
	 * Delegate method for {@link ResultSet#first()}.
	 */
	public boolean first() throws SQLException {
		return parent.first();
	}
	
	/**
	 * Delegate method for {@link ResultSet#getArray(int)}.
	 */
	public Array getArray(int i) throws SQLException {
		return parent.getArray(i);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getArray(String)}.
	 */
	public Array getArray(String colName) throws SQLException {
		return parent.getArray(colName);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getAsciiStream(int)}.
	 */
	public InputStream getAsciiStream(int columnIndex) throws SQLException {
		return parent.getAsciiStream(columnIndex);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getAsciiStream(String)}.
	 */
	public InputStream getAsciiStream(String columnName) throws SQLException {
		return parent.getAsciiStream(columnName);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getBigDecimal(int, int)}.
	 */
	@SuppressWarnings("deprecation")
	public BigDecimal getBigDecimal(int columnIndex, int scale) throws SQLException {
		return parent.getBigDecimal(columnIndex, scale);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getBigDecimal(int)}.
	 */
	public BigDecimal getBigDecimal(int columnIndex) throws SQLException {
		return parent.getBigDecimal(columnIndex);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getBigDecimal(String, int)}.
	 */
	@SuppressWarnings("deprecation")
	public BigDecimal getBigDecimal(String columnName, int scale) throws SQLException {
		return parent.getBigDecimal(columnName, scale);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getBigDecimal(String)}.
	 */
	public BigDecimal getBigDecimal(String columnName) throws SQLException {
		return parent.getBigDecimal(columnName);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getBinaryStream(int)}.
	 */
	public InputStream getBinaryStream(int columnIndex) throws SQLException {
		return parent.getBinaryStream(columnIndex);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getBinaryStream(String)}.
	 */
	public InputStream getBinaryStream(String columnName) throws SQLException {
		return parent.getBinaryStream(columnName);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getBlob(int)}.
	 */
	public Blob getBlob(int i) throws SQLException {
		return parent.getBlob(i);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getBlob(String)}.
	 */
	public Blob getBlob(String colName) throws SQLException {
		return parent.getBlob(colName);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getBoolean(int)}.
	 */
	public boolean getBoolean(int columnIndex) throws SQLException {
		return parent.getBoolean(columnIndex);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getBoolean(String)}.
	 */
	public boolean getBoolean(String columnName) throws SQLException {
		return parent.getBoolean(columnName);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getByte(int)}.
	 */
	public byte getByte(int columnIndex) throws SQLException {
		return parent.getByte(columnIndex);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getByte(String)}.
	 */
	public byte getByte(String columnName) throws SQLException {
		return parent.getByte(columnName);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getBytes(int)}.
	 */
	public byte[] getBytes(int columnIndex) throws SQLException {
		return parent.getBytes(columnIndex);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getBytes(String)}.
	 */
	public byte[] getBytes(String columnName) throws SQLException {
		return parent.getBytes(columnName);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getCharacterStream(int)}.
	 */
	public Reader getCharacterStream(int columnIndex) throws SQLException {
		return parent.getCharacterStream(columnIndex);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getCharacterStream(String)}.
	 */
	public Reader getCharacterStream(String columnName) throws SQLException {
		return parent.getCharacterStream(columnName);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getClob(int)}.
	 */
	public Clob getClob(int i) throws SQLException {
		return parent.getClob(i);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getClob(String)}.
	 */
	public Clob getClob(String colName) throws SQLException {
		return parent.getClob(colName);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getConcurrency()}.
	 */
	public int getConcurrency() throws SQLException {
		return parent.getConcurrency();
	}
	
	/**
	 * Delegate method for {@link ResultSet#getCursorName()}.
	 */
	public String getCursorName() throws SQLException {
		return parent.getCursorName();
	}
	
	/**
	 * Delegate method for {@link ResultSet#getDate(int, Calendar)}.
	 */
	public Date getDate(int columnIndex, Calendar cal) throws SQLException {
		return parent.getDate(columnIndex, cal);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getDate(int)}.
	 */
	public Date getDate(int columnIndex) throws SQLException {
		return parent.getDate(columnIndex);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getDate(String, Calendar)}.
	 */
	public Date getDate(String columnName, Calendar cal) throws SQLException {
		return parent.getDate(columnName, cal);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getDate(String)}.
	 */
	public Date getDate(String columnName) throws SQLException {
		return parent.getDate(columnName);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getDouble(int)}.
	 */
	public double getDouble(int columnIndex) throws SQLException {
		return parent.getDouble(columnIndex);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getDouble(String)}.
	 */
	public double getDouble(String columnName) throws SQLException {
		return parent.getDouble(columnName);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getFetchDirection()}.
	 */
	public int getFetchDirection() throws SQLException {
		return parent.getFetchDirection();
	}
	
	/**
	 * Delegate method for {@link ResultSet#getFetchSize()}.
	 */
	public int getFetchSize() throws SQLException {
		return parent.getFetchSize();
	}
	
	/**
	 * Delegate method for {@link ResultSet#getFloat(int)}.
	 */
	public float getFloat(int columnIndex) throws SQLException {
		return parent.getFloat(columnIndex);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getFloat(String)}.
	 */
	public float getFloat(String columnName) throws SQLException {
		return parent.getFloat(columnName);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getInt(int)}.
	 */
	public int getInt(int columnIndex) throws SQLException {
		return parent.getInt(columnIndex);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getInt(String)}.
	 */
	public int getInt(String columnName) throws SQLException {
		return parent.getInt(columnName);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getLong(int)}.
	 */
	public long getLong(int columnIndex) throws SQLException {
		return parent.getLong(columnIndex);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getLong(String)}.
	 */
	public long getLong(String columnName) throws SQLException {
		return parent.getLong(columnName);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getMetaData()}.
	 */
	public ResultSetMetaData getMetaData() throws SQLException {
		return parent.getMetaData();
	}
	
	/**
	 * Delegate method for {@link ResultSet#getObject(int, Map)}.
	 */
	public Object getObject(int i, Map<String,Class<?>> map) throws SQLException {
		return parent.getObject(i, map);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getObject(int)}.
	 */
	public Object getObject(int columnIndex) throws SQLException {
		return parent.getObject(columnIndex);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getObject(String, Map)}.
	 */
	public Object getObject(String colName, Map<String,Class<?>> map) throws SQLException {
		return parent.getObject(colName, map);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getObject(String)}.
	 */
	public Object getObject(String columnName) throws SQLException {
		return parent.getObject(columnName);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getRef(int)}.
	 */
	public Ref getRef(int i) throws SQLException {
		return parent.getRef(i);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getRef(String)}.
	 */
	public Ref getRef(String colName) throws SQLException {
		return parent.getRef(colName);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getRow()}.
	 */
	public int getRow() throws SQLException {
		return parent.getRow();
	}
	
	/**
	 * Delegate method for {@link ResultSet#getShort(int)}.
	 */
	public short getShort(int columnIndex) throws SQLException {
		return parent.getShort(columnIndex);
	}
	
	/**
	 * Delegate method for {@link ResultSet#getShort(String)}.
	 */
	public short getShort(String columnName) throws SQLException {
		return parent.getShort(columnName);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public Statement getStatement() throws SQLException {
		return parent.getStatement();
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public String getString(int columnIndex) throws SQLException {
		return parent.getString(columnIndex);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public String getString(String columnName) throws SQLException {
		return parent.getString(columnName);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public Time getTime(int columnIndex, Calendar cal) throws SQLException {
		return parent.getTime(columnIndex, cal);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public Time getTime(int columnIndex) throws SQLException {
		return parent.getTime(columnIndex);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public Time getTime(String columnName, Calendar cal) throws SQLException {
		return parent.getTime(columnName, cal);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public Time getTime(String columnName) throws SQLException {
		return parent.getTime(columnName);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public Timestamp getTimestamp(int columnIndex, Calendar cal)
			throws SQLException {
		return parent.getTimestamp(columnIndex, cal);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public Timestamp getTimestamp(int columnIndex) throws SQLException {
		return parent.getTimestamp(columnIndex);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public Timestamp getTimestamp(String columnName, Calendar cal)
			throws SQLException {
		return parent.getTimestamp(columnName, cal);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public Timestamp getTimestamp(String columnName) throws SQLException {
		return parent.getTimestamp(columnName);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public int getType() throws SQLException {
		return parent.getType();
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public InputStream getUnicodeStream(int columnIndex) throws SQLException {
		return parent.getUnicodeStream(columnIndex);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public InputStream getUnicodeStream(String columnName) throws SQLException {
		return parent.getUnicodeStream(columnName);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public URL getURL(int columnIndex) throws SQLException {
		return parent.getURL(columnIndex);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public URL getURL(String columnName) throws SQLException {
		return parent.getURL(columnName);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public SQLWarning getWarnings() throws SQLException {
		return parent.getWarnings();
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void insertRow() throws SQLException {
		parent.insertRow();
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public boolean isAfterLast() throws SQLException {
		return parent.isAfterLast();
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public boolean isBeforeFirst() throws SQLException {
		return parent.isBeforeFirst();
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public boolean isFirst() throws SQLException {
		return parent.isFirst();
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public boolean isLast() throws SQLException {
		return parent.isLast();
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public boolean last() throws SQLException {
		return parent.last();
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void moveToCurrentRow() throws SQLException {
		parent.moveToCurrentRow();
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void moveToInsertRow() throws SQLException {
		parent.moveToInsertRow();
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public boolean next() throws SQLException {
		return parent.next();
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public boolean previous() throws SQLException {
		return parent.previous();
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void refreshRow() throws SQLException {
		parent.refreshRow();
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public boolean relative(int rows) throws SQLException {
		return parent.relative(rows);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public boolean rowDeleted() throws SQLException {
		return parent.rowDeleted();
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public boolean rowInserted() throws SQLException {
		return parent.rowInserted();
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public boolean rowUpdated() throws SQLException {
		return parent.rowUpdated();
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void setFetchDirection(int direction) throws SQLException {
		parent.setFetchDirection(direction);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void setFetchSize(int rows) throws SQLException {
		parent.setFetchSize(rows);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateArray(int columnIndex, Array x) throws SQLException {
		parent.updateArray(columnIndex, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateArray(String columnName, Array x) throws SQLException {
		parent.updateArray(columnName, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateAsciiStream(int columnIndex, InputStream x, int length)
			throws SQLException {
		parent.updateAsciiStream(columnIndex, x, length);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateAsciiStream(String columnName, InputStream x, int length)
			throws SQLException {
		parent.updateAsciiStream(columnName, x, length);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateBigDecimal(int columnIndex, BigDecimal x)
			throws SQLException {
		parent.updateBigDecimal(columnIndex, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateBigDecimal(String columnName, BigDecimal x)
			throws SQLException {
		parent.updateBigDecimal(columnName, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateBinaryStream(int columnIndex, InputStream x, int length)
			throws SQLException {
		parent.updateBinaryStream(columnIndex, x, length);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateBinaryStream(String columnName, InputStream x, int length)
			throws SQLException {
		parent.updateBinaryStream(columnName, x, length);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateBlob(int columnIndex, Blob x) throws SQLException {
		parent.updateBlob(columnIndex, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateBlob(String columnName, Blob x) throws SQLException {
		parent.updateBlob(columnName, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateBoolean(int columnIndex, boolean x) throws SQLException {
		parent.updateBoolean(columnIndex, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateBoolean(String columnName, boolean x) throws SQLException {
		parent.updateBoolean(columnName, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateByte(int columnIndex, byte x) throws SQLException {
		parent.updateByte(columnIndex, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateByte(String columnName, byte x) throws SQLException {
		parent.updateByte(columnName, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateBytes(int columnIndex, byte[] x) throws SQLException {
		parent.updateBytes(columnIndex, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateBytes(String columnName, byte[] x) throws SQLException {
		parent.updateBytes(columnName, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateCharacterStream(int columnIndex, Reader x, int length)
			throws SQLException {
		parent.updateCharacterStream(columnIndex, x, length);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateCharacterStream(String columnName, Reader reader,
			int length) throws SQLException {
		parent.updateCharacterStream(columnName, reader, length);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateClob(int columnIndex, Clob x) throws SQLException {
		parent.updateClob(columnIndex, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateClob(String columnName, Clob x) throws SQLException {
		parent.updateClob(columnName, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateDate(int columnIndex, Date x) throws SQLException {
		parent.updateDate(columnIndex, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateDate(String columnName, Date x) throws SQLException {
		parent.updateDate(columnName, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateDouble(int columnIndex, double x) throws SQLException {
		parent.updateDouble(columnIndex, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateDouble(String columnName, double x) throws SQLException {
		parent.updateDouble(columnName, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateFloat(int columnIndex, float x) throws SQLException {
		parent.updateFloat(columnIndex, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateFloat(String columnName, float x) throws SQLException {
		parent.updateFloat(columnName, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateInt(int columnIndex, int x) throws SQLException {
		parent.updateInt(columnIndex, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateInt(String columnName, int x) throws SQLException {
		parent.updateInt(columnName, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateLong(int columnIndex, long x) throws SQLException {
		parent.updateLong(columnIndex, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateLong(String columnName, long x) throws SQLException {
		parent.updateLong(columnName, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateNull(int columnIndex) throws SQLException {
		parent.updateNull(columnIndex);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateNull(String columnName) throws SQLException {
		parent.updateNull(columnName);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateObject(int columnIndex, Object x, int scale)
			throws SQLException {
		parent.updateObject(columnIndex, x, scale);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateObject(int columnIndex, Object x) throws SQLException {
		parent.updateObject(columnIndex, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateObject(String columnName, Object x, int scale)
			throws SQLException {
		parent.updateObject(columnName, x, scale);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateObject(String columnName, Object x) throws SQLException {
		parent.updateObject(columnName, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateRef(int columnIndex, Ref x) throws SQLException {
		parent.updateRef(columnIndex, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateRef(String columnName, Ref x) throws SQLException {
		parent.updateRef(columnName, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateRow() throws SQLException {
		parent.updateRow();
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateShort(int columnIndex, short x) throws SQLException {
		parent.updateShort(columnIndex, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateShort(String columnName, short x) throws SQLException {
		parent.updateShort(columnName, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateString(int columnIndex, String x) throws SQLException {
		parent.updateString(columnIndex, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateString(String columnName, String x) throws SQLException {
		parent.updateString(columnName, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateTime(int columnIndex, Time x) throws SQLException {
		parent.updateTime(columnIndex, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateTime(String columnName, Time x) throws SQLException {
		parent.updateTime(columnName, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateTimestamp(int columnIndex, Timestamp x)
			throws SQLException {
		parent.updateTimestamp(columnIndex, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public void updateTimestamp(String columnName, Timestamp x)
			throws SQLException {
		parent.updateTimestamp(columnName, x);
	}
	
	/**
	 * Delegate method for {@link ResultSet#}.
	 */
	public boolean wasNull() throws SQLException {
		return parent.wasNull();
	}
}
