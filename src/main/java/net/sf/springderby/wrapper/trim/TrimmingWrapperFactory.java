package net.sf.springderby.wrapper.trim;

import net.sf.springderby.wrapper.ResultSetType;
import net.sf.springderby.wrapper.ResultSetWrapper;
import net.sf.springderby.wrapper.WrapperFactory;

public class TrimmingWrapperFactory extends WrapperFactory {
	@Override
	public ResultSetWrapper createResultSetWrapper(ResultSetType resultSetType) {
		return resultSetType == ResultSetType.QUERY ? new TrimmingResultSetWrapper() : super.createResultSetWrapper(resultSetType);
	}
}
