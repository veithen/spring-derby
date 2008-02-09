package net.sf.springderby.wrapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class WrapperFactory {
	public ConnectionWrapper wrapConnection(Connection parent) {
		return new ConnectionWrapper(this, parent);
	}
	
	public StatementWrapper wrapStatement(Statement parent) {
		return new StatementWrapper(this, parent);
	}
	
	public PreparedStatementWrapper wrapPreparedStatement(PreparedStatement parent) {
		return new PreparedStatementWrapper(this, parent);
	}
	
	public ResultSetWrapper wrapResultSet(@SuppressWarnings("unused") ResultSetType resultSetType, ResultSet parent) {
		return new ResultSetWrapper(parent);
	}
}
