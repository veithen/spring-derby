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

	public boolean absolute(int row) throws SQLException {
		return parent.absolute(row);
	}

	public void afterLast() throws SQLException {
		parent.afterLast();
	}

	public void beforeFirst() throws SQLException {
		parent.beforeFirst();
	}

	public void cancelRowUpdates() throws SQLException {
		parent.cancelRowUpdates();
	}

	public void clearWarnings() throws SQLException {
		parent.clearWarnings();
	}

	public void close() throws SQLException {
		parent.close();
	}

	public void deleteRow() throws SQLException {
		parent.deleteRow();
	}

	public int findColumn(String columnName) throws SQLException {
		return parent.findColumn(columnName);
	}

	public boolean first() throws SQLException {
		return parent.first();
	}

	public Array getArray(int i) throws SQLException {
		return parent.getArray(i);
	}

	public Array getArray(String colName) throws SQLException {
		return parent.getArray(colName);
	}

	public InputStream getAsciiStream(int columnIndex) throws SQLException {
		return parent.getAsciiStream(columnIndex);
	}

	public InputStream getAsciiStream(String columnName) throws SQLException {
		return parent.getAsciiStream(columnName);
	}

	public BigDecimal getBigDecimal(int columnIndex, int scale)
			throws SQLException {
		return parent.getBigDecimal(columnIndex, scale);
	}

	public BigDecimal getBigDecimal(int columnIndex) throws SQLException {
		return parent.getBigDecimal(columnIndex);
	}

	public BigDecimal getBigDecimal(String columnName, int scale)
			throws SQLException {
		return parent.getBigDecimal(columnName, scale);
	}

	public BigDecimal getBigDecimal(String columnName) throws SQLException {
		return parent.getBigDecimal(columnName);
	}

	public InputStream getBinaryStream(int columnIndex) throws SQLException {
		return parent.getBinaryStream(columnIndex);
	}

	public InputStream getBinaryStream(String columnName) throws SQLException {
		return parent.getBinaryStream(columnName);
	}

	public Blob getBlob(int i) throws SQLException {
		return parent.getBlob(i);
	}

	public Blob getBlob(String colName) throws SQLException {
		return parent.getBlob(colName);
	}

	public boolean getBoolean(int columnIndex) throws SQLException {
		return parent.getBoolean(columnIndex);
	}

	public boolean getBoolean(String columnName) throws SQLException {
		return parent.getBoolean(columnName);
	}

	public byte getByte(int columnIndex) throws SQLException {
		return parent.getByte(columnIndex);
	}

	public byte getByte(String columnName) throws SQLException {
		return parent.getByte(columnName);
	}

	public byte[] getBytes(int columnIndex) throws SQLException {
		return parent.getBytes(columnIndex);
	}

	public byte[] getBytes(String columnName) throws SQLException {
		return parent.getBytes(columnName);
	}

	public Reader getCharacterStream(int columnIndex) throws SQLException {
		return parent.getCharacterStream(columnIndex);
	}

	public Reader getCharacterStream(String columnName) throws SQLException {
		return parent.getCharacterStream(columnName);
	}

	public Clob getClob(int i) throws SQLException {
		return parent.getClob(i);
	}

	public Clob getClob(String colName) throws SQLException {
		return parent.getClob(colName);
	}

	public int getConcurrency() throws SQLException {
		return parent.getConcurrency();
	}

	public String getCursorName() throws SQLException {
		return parent.getCursorName();
	}

	public Date getDate(int columnIndex, Calendar cal) throws SQLException {
		return parent.getDate(columnIndex, cal);
	}

	public Date getDate(int columnIndex) throws SQLException {
		return parent.getDate(columnIndex);
	}

	public Date getDate(String columnName, Calendar cal) throws SQLException {
		return parent.getDate(columnName, cal);
	}

	public Date getDate(String columnName) throws SQLException {
		return parent.getDate(columnName);
	}

	public double getDouble(int columnIndex) throws SQLException {
		return parent.getDouble(columnIndex);
	}

	public double getDouble(String columnName) throws SQLException {
		return parent.getDouble(columnName);
	}

	public int getFetchDirection() throws SQLException {
		return parent.getFetchDirection();
	}

	public int getFetchSize() throws SQLException {
		return parent.getFetchSize();
	}

	public float getFloat(int columnIndex) throws SQLException {
		return parent.getFloat(columnIndex);
	}

	public float getFloat(String columnName) throws SQLException {
		return parent.getFloat(columnName);
	}

	public int getInt(int columnIndex) throws SQLException {
		return parent.getInt(columnIndex);
	}

	public int getInt(String columnName) throws SQLException {
		return parent.getInt(columnName);
	}

	public long getLong(int columnIndex) throws SQLException {
		return parent.getLong(columnIndex);
	}

	public long getLong(String columnName) throws SQLException {
		return parent.getLong(columnName);
	}

	public ResultSetMetaData getMetaData() throws SQLException {
		return parent.getMetaData();
	}

	public Object getObject(int i, Map<String, Class<?>> map)
			throws SQLException {
		return parent.getObject(i, map);
	}

	public Object getObject(int columnIndex) throws SQLException {
		return parent.getObject(columnIndex);
	}

	public Object getObject(String colName, Map<String, Class<?>> map)
			throws SQLException {
		return parent.getObject(colName, map);
	}

	public Object getObject(String columnName) throws SQLException {
		return parent.getObject(columnName);
	}

	public Ref getRef(int i) throws SQLException {
		return parent.getRef(i);
	}

	public Ref getRef(String colName) throws SQLException {
		return parent.getRef(colName);
	}

	public int getRow() throws SQLException {
		return parent.getRow();
	}

	public short getShort(int columnIndex) throws SQLException {
		return parent.getShort(columnIndex);
	}

	public short getShort(String columnName) throws SQLException {
		return parent.getShort(columnName);
	}

	public Statement getStatement() throws SQLException {
		return parent.getStatement();
	}

	public String getString(int columnIndex) throws SQLException {
		return parent.getString(columnIndex);
	}

	public String getString(String columnName) throws SQLException {
		return parent.getString(columnName);
	}

	public Time getTime(int columnIndex, Calendar cal) throws SQLException {
		return parent.getTime(columnIndex, cal);
	}

	public Time getTime(int columnIndex) throws SQLException {
		return parent.getTime(columnIndex);
	}

	public Time getTime(String columnName, Calendar cal) throws SQLException {
		return parent.getTime(columnName, cal);
	}

	public Time getTime(String columnName) throws SQLException {
		return parent.getTime(columnName);
	}

	public Timestamp getTimestamp(int columnIndex, Calendar cal)
			throws SQLException {
		return parent.getTimestamp(columnIndex, cal);
	}

	public Timestamp getTimestamp(int columnIndex) throws SQLException {
		return parent.getTimestamp(columnIndex);
	}

	public Timestamp getTimestamp(String columnName, Calendar cal)
			throws SQLException {
		return parent.getTimestamp(columnName, cal);
	}

	public Timestamp getTimestamp(String columnName) throws SQLException {
		return parent.getTimestamp(columnName);
	}

	public int getType() throws SQLException {
		return parent.getType();
	}

	public InputStream getUnicodeStream(int columnIndex) throws SQLException {
		return parent.getUnicodeStream(columnIndex);
	}

	public InputStream getUnicodeStream(String columnName) throws SQLException {
		return parent.getUnicodeStream(columnName);
	}

	public URL getURL(int columnIndex) throws SQLException {
		return parent.getURL(columnIndex);
	}

	public URL getURL(String columnName) throws SQLException {
		return parent.getURL(columnName);
	}

	public SQLWarning getWarnings() throws SQLException {
		return parent.getWarnings();
	}

	public void insertRow() throws SQLException {
		parent.insertRow();
	}

	public boolean isAfterLast() throws SQLException {
		return parent.isAfterLast();
	}

	public boolean isBeforeFirst() throws SQLException {
		return parent.isBeforeFirst();
	}

	public boolean isFirst() throws SQLException {
		return parent.isFirst();
	}

	public boolean isLast() throws SQLException {
		return parent.isLast();
	}

	public boolean last() throws SQLException {
		return parent.last();
	}

	public void moveToCurrentRow() throws SQLException {
		parent.moveToCurrentRow();
	}

	public void moveToInsertRow() throws SQLException {
		parent.moveToInsertRow();
	}

	public boolean next() throws SQLException {
		return parent.next();
	}

	public boolean previous() throws SQLException {
		return parent.previous();
	}

	public void refreshRow() throws SQLException {
		parent.refreshRow();
	}

	public boolean relative(int rows) throws SQLException {
		return parent.relative(rows);
	}

	public boolean rowDeleted() throws SQLException {
		return parent.rowDeleted();
	}

	public boolean rowInserted() throws SQLException {
		return parent.rowInserted();
	}

	public boolean rowUpdated() throws SQLException {
		return parent.rowUpdated();
	}

	public void setFetchDirection(int direction) throws SQLException {
		parent.setFetchDirection(direction);
	}

	public void setFetchSize(int rows) throws SQLException {
		parent.setFetchSize(rows);
	}

	public void updateArray(int columnIndex, Array x) throws SQLException {
		parent.updateArray(columnIndex, x);
	}

	public void updateArray(String columnName, Array x) throws SQLException {
		parent.updateArray(columnName, x);
	}

	public void updateAsciiStream(int columnIndex, InputStream x, int length)
			throws SQLException {
		parent.updateAsciiStream(columnIndex, x, length);
	}

	public void updateAsciiStream(String columnName, InputStream x, int length)
			throws SQLException {
		parent.updateAsciiStream(columnName, x, length);
	}

	public void updateBigDecimal(int columnIndex, BigDecimal x)
			throws SQLException {
		parent.updateBigDecimal(columnIndex, x);
	}

	public void updateBigDecimal(String columnName, BigDecimal x)
			throws SQLException {
		parent.updateBigDecimal(columnName, x);
	}

	public void updateBinaryStream(int columnIndex, InputStream x, int length)
			throws SQLException {
		parent.updateBinaryStream(columnIndex, x, length);
	}

	public void updateBinaryStream(String columnName, InputStream x, int length)
			throws SQLException {
		parent.updateBinaryStream(columnName, x, length);
	}

	public void updateBlob(int columnIndex, Blob x) throws SQLException {
		parent.updateBlob(columnIndex, x);
	}

	public void updateBlob(String columnName, Blob x) throws SQLException {
		parent.updateBlob(columnName, x);
	}

	public void updateBoolean(int columnIndex, boolean x) throws SQLException {
		parent.updateBoolean(columnIndex, x);
	}

	public void updateBoolean(String columnName, boolean x) throws SQLException {
		parent.updateBoolean(columnName, x);
	}

	public void updateByte(int columnIndex, byte x) throws SQLException {
		parent.updateByte(columnIndex, x);
	}

	public void updateByte(String columnName, byte x) throws SQLException {
		parent.updateByte(columnName, x);
	}

	public void updateBytes(int columnIndex, byte[] x) throws SQLException {
		parent.updateBytes(columnIndex, x);
	}

	public void updateBytes(String columnName, byte[] x) throws SQLException {
		parent.updateBytes(columnName, x);
	}

	public void updateCharacterStream(int columnIndex, Reader x, int length)
			throws SQLException {
		parent.updateCharacterStream(columnIndex, x, length);
	}

	public void updateCharacterStream(String columnName, Reader reader,
			int length) throws SQLException {
		parent.updateCharacterStream(columnName, reader, length);
	}

	public void updateClob(int columnIndex, Clob x) throws SQLException {
		parent.updateClob(columnIndex, x);
	}

	public void updateClob(String columnName, Clob x) throws SQLException {
		parent.updateClob(columnName, x);
	}

	public void updateDate(int columnIndex, Date x) throws SQLException {
		parent.updateDate(columnIndex, x);
	}

	public void updateDate(String columnName, Date x) throws SQLException {
		parent.updateDate(columnName, x);
	}

	public void updateDouble(int columnIndex, double x) throws SQLException {
		parent.updateDouble(columnIndex, x);
	}

	public void updateDouble(String columnName, double x) throws SQLException {
		parent.updateDouble(columnName, x);
	}

	public void updateFloat(int columnIndex, float x) throws SQLException {
		parent.updateFloat(columnIndex, x);
	}

	public void updateFloat(String columnName, float x) throws SQLException {
		parent.updateFloat(columnName, x);
	}

	public void updateInt(int columnIndex, int x) throws SQLException {
		parent.updateInt(columnIndex, x);
	}

	public void updateInt(String columnName, int x) throws SQLException {
		parent.updateInt(columnName, x);
	}

	public void updateLong(int columnIndex, long x) throws SQLException {
		parent.updateLong(columnIndex, x);
	}

	public void updateLong(String columnName, long x) throws SQLException {
		parent.updateLong(columnName, x);
	}

	public void updateNull(int columnIndex) throws SQLException {
		parent.updateNull(columnIndex);
	}

	public void updateNull(String columnName) throws SQLException {
		parent.updateNull(columnName);
	}

	public void updateObject(int columnIndex, Object x, int scale)
			throws SQLException {
		parent.updateObject(columnIndex, x, scale);
	}

	public void updateObject(int columnIndex, Object x) throws SQLException {
		parent.updateObject(columnIndex, x);
	}

	public void updateObject(String columnName, Object x, int scale)
			throws SQLException {
		parent.updateObject(columnName, x, scale);
	}

	public void updateObject(String columnName, Object x) throws SQLException {
		parent.updateObject(columnName, x);
	}

	public void updateRef(int columnIndex, Ref x) throws SQLException {
		parent.updateRef(columnIndex, x);
	}

	public void updateRef(String columnName, Ref x) throws SQLException {
		parent.updateRef(columnName, x);
	}

	public void updateRow() throws SQLException {
		parent.updateRow();
	}

	public void updateShort(int columnIndex, short x) throws SQLException {
		parent.updateShort(columnIndex, x);
	}

	public void updateShort(String columnName, short x) throws SQLException {
		parent.updateShort(columnName, x);
	}

	public void updateString(int columnIndex, String x) throws SQLException {
		parent.updateString(columnIndex, x);
	}

	public void updateString(String columnName, String x) throws SQLException {
		parent.updateString(columnName, x);
	}

	public void updateTime(int columnIndex, Time x) throws SQLException {
		parent.updateTime(columnIndex, x);
	}

	public void updateTime(String columnName, Time x) throws SQLException {
		parent.updateTime(columnName, x);
	}

	public void updateTimestamp(int columnIndex, Timestamp x)
			throws SQLException {
		parent.updateTimestamp(columnIndex, x);
	}

	public void updateTimestamp(String columnName, Timestamp x)
			throws SQLException {
		parent.updateTimestamp(columnName, x);
	}

	public boolean wasNull() throws SQLException {
		return parent.wasNull();
	}
}
