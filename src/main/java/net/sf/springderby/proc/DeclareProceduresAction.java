package net.sf.springderby.proc;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import net.sf.springderby.OnlineAction;
import net.sf.springderby.OnlineActionContext;
import net.sf.springderby.proc.annotation.Function;

public class DeclareProceduresAction implements OnlineAction {
	private final static Map<Class<?>,String> typeMap = new HashMap<Class<?>,String>();
	
	static {
		// TODO: complete this
		typeMap.put(Date.class, "DATE");
		typeMap.put(Integer.TYPE, "INTEGER");
	}
	
	private String className;
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	private String getSqlType(Class<?> javaType) {
		String sqlType = typeMap.get(javaType);
		if (sqlType == null) {
			throw new Error(); // TODO
		} else {
			return sqlType;
		}
	}
	
	public void execute(OnlineActionContext context) throws Exception {
		Class<?> clazz = Class.forName(className);
		boolean found = false;
		for (Method method : clazz.getDeclaredMethods()) {
			if (Modifier.isStatic(method.getModifiers())) {
				Function functionAnnotation = method.getAnnotation(Function.class);
				if (functionAnnotation != null) {
					StringBuilder buffer = new StringBuilder("CREATE FUNCTION ");
					buffer.append(functionAnnotation.name());
					buffer.append(" (");
					Class<?>[] parameterTypes = method.getParameterTypes();
					for (int i = 0; i < parameterTypes.length; i++) {
						if (i > 0) {
							buffer.append(", ");
						}
						buffer.append("ARG");
						buffer.append(i);
						buffer.append(" ");
						buffer.append(getSqlType(parameterTypes[i]));
					}
					buffer.append(") RETURNS ");
					buffer.append(getSqlType(method.getReturnType()));
					buffer.append(" LANGUAGE JAVA EXTERNAL NAME '");
					buffer.append(clazz.getName());
					buffer.append(".");
					buffer.append(method.getName());
					buffer.append("' PARAMETER STYLE JAVA ");
					buffer.append(functionAnnotation.dataAccessLevel().getSql());
					buffer.append(" ");
					buffer.append(functionAnnotation.onNullInput().getSql());
					context.getJdbcTemplate().execute(buffer.toString());
					found = true;
				}
			}
		}
		if (!found) {
			throw new Error("No procedures or functions found in " + clazz.getName()); // TODO
		}
	}
}
