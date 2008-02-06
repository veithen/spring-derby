package net.sf.springderby;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.core.io.Resource;
import org.springframework.dao.DataAccessException;

public interface SqlScriptExecutor {
	void executeScript(Connection connection, Resource script, String encoding) throws SQLException, DataAccessException, IOException;
}
