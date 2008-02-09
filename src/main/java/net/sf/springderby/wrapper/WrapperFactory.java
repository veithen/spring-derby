package net.sf.springderby.wrapper;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class WrapperFactory {
	public ConnectionWrapper wrapConnection(Connection parent) {
		return new ConnectionWrapper(this, parent);
	}
	
	public DatabaseMetaDataWrapper wrapDatabaseMetaData(DatabaseMetaData parent) {
		return new DatabaseMetaDataWrapper(this, parent);
	}
	
	public StatementWrapper wrapStatement(Statement parent) {
		return new StatementWrapper(this, parent);
	}
	
	public PreparedStatementWrapper wrapPreparedStatement(PreparedStatement parent) {
		return new PreparedStatementWrapper(this, parent);
	}
	
	public CallableStatementWrapper wrapCallableStatement(CallableStatement parent) {
		return new CallableStatementWrapper(this, parent);
	}
	
	public ResultSetWrapper wrapResultSet(@SuppressWarnings("unused") ResultSetType resultSetType, ResultSet parent) {
		return new ResultSetWrapper(parent);
	}
}
