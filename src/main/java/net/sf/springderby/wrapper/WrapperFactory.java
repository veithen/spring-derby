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
	
	public StatementWrapper wrapStatement(ConnectionWrapper connectionWrapper, Statement parent) {
		return new StatementWrapper(this, connectionWrapper, parent);
	}
	
	public PreparedStatementWrapper wrapPreparedStatement(ConnectionWrapper connectionWrapper, PreparedStatement parent) {
		return new PreparedStatementWrapper(this, connectionWrapper, parent);
	}
	
	public CallableStatementWrapper wrapCallableStatement(ConnectionWrapper connectionWrapper, CallableStatement parent) {
		return new CallableStatementWrapper(this, connectionWrapper, parent);
	}
	
	public ResultSetWrapper wrapResultSet(@SuppressWarnings("unused") ResultSetType resultSetType, ResultSet parent) {
		return new ResultSetWrapper(parent);
	}
}
