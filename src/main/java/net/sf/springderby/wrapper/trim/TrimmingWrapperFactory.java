package net.sf.springderby.wrapper.trim;

import java.sql.ResultSet;

import net.sf.springderby.wrapper.ResultSetType;
import net.sf.springderby.wrapper.ResultSetWrapper;
import net.sf.springderby.wrapper.WrapperFactory;

public class TrimmingWrapperFactory extends WrapperFactory {
	@Override
	public ResultSetWrapper wrapResultSet(ResultSetType resultSetType, ResultSet parent) {
		return resultSetType == ResultSetType.QUERY ? new TrimmingResultSetWrapper(parent) : super.wrapResultSet(resultSetType, parent);
	}
}
