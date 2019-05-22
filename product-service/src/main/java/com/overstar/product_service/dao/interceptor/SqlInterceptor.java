package com.overstar.product_service.dao.interceptor;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.TypeHandlerRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * sql拦截器
 * @author Sean.Yang
 *
 */
@Intercepts({
        @Signature(type = Executor.class, method = "update", args = { MappedStatement.class, Object.class }),
        @Signature(type = Executor.class, method = "query", args = { MappedStatement.class, Object.class,
                RowBounds.class, ResultHandler.class }) })
public class SqlInterceptor implements Interceptor {
	
	private static final Logger log = LoggerFactory.getLogger("db");
	
	private boolean printSql;
	/**crud后的一些操作*/
	private AfterCrud afterCrud = null;
 
    public Object intercept(Invocation invocation) throws Throwable {
        
        Object returnValue = null;
        long time = 0;
        try {
        	long start = System.currentTimeMillis();
        	returnValue = invocation.proceed();
        	long end = System.currentTimeMillis();
        	time = (end - start);//计算调用耗时毫秒
		} catch (Throwable e) {
			throw e;
		} finally{
			MappedStatement mappedStatement = (MappedStatement) invocation.getArgs()[0];
            String sqlId = mappedStatement.getId();
			if( printSql ) {//出错也打印sql
				Object parameter = null;
	            if (invocation.getArgs().length > 1) {
	                parameter = invocation.getArgs()[1];
	            }
	            String runtimeSql = null;
	            BoundSql boundSql = mappedStatement.getBoundSql(parameter);
	            Configuration configuration = mappedStatement.getConfiguration();
	            List<Object> params = getRuntimeParams(configuration, boundSql);//查询参数
	            runtimeSql = getRuntimeSql(boundSql, params);
	        	print(sqlId, runtimeSql, time);//输入SQL
	        }
			//crud后的一些操作
			if(afterCrud != null){
				afterCrud.action(sqlId, mappedStatement.getSqlCommandType(), invocation.getArgs());
			}
		}
        return returnValue;
    }
 
    /**
     * 打印SQL日志
     * @param sqlId
     * @param time
     * @return
     */
    private void print(String sqlId, String sql, long time) {
        StringBuilder info = new StringBuilder(sql.length() + 128);
        DateFormat format = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT, Locale.CHINA);
        info.append( format.format(new Date()) + " [" + sqlId + "] cost " + time + " ms\n");
        info.append( sql + "\n");
        log.info(info.toString());
    }
 
    /**
     * 取得运行时的SQL 替换对应的参数
     * @param boundSql 
     * @param params
     * @return
     */
    public static String getRuntimeSql(BoundSql boundSql, List<Object> params) {
        String sql = boundSql.getSql();
        for (Object object : params) {
        	sql = sql.replaceFirst("\\?", getParameterValue(object));
		}
        return sql;
    }
    
    /**
     * 取得运行时的参数
     * @param configuration 
     * @param boundSql
     * @return
     */
    public static List<Object> getRuntimeParams(Configuration configuration, BoundSql boundSql) {
    	List<Object> params = new ArrayList<Object>();
        Object parameterObject = boundSql.getParameterObject();
        List<ParameterMapping> parameterMappings = boundSql.getParameterMappings();
        if (parameterMappings.size() > 0 && parameterObject != null) {
            TypeHandlerRegistry typeHandlerRegistry = configuration.getTypeHandlerRegistry();
            if (typeHandlerRegistry.hasTypeHandler(parameterObject.getClass())) {
                params.add(parameterObject);
            } else {
                MetaObject metaObject = configuration.newMetaObject(parameterObject);
                for (ParameterMapping parameterMapping : parameterMappings) {
                    String propertyName = parameterMapping.getProperty();
                    if (metaObject.hasGetter(propertyName)) {
                        Object obj = metaObject.getValue(propertyName);
                        params.add(obj);
                    } else if (boundSql.hasAdditionalParameter(propertyName)) {
                        Object obj = boundSql.getAdditionalParameter(propertyName);
                        params.add(obj);
                    }
                }
            }
        }
        return params;
    }
    
    /**
     * 取得参数值
     * @param obj
     * @return
     */
    private static String getParameterValue(Object obj) {
        String value = "";
        if (obj instanceof String) {
            value = "'" + obj+ "'";
        } else if (obj instanceof Date) {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            value = "'" + formatter.format((Date)obj) + "'";
        } else if (obj != null) {
        	value = obj.toString();
        }
        value = value.replace("$", "\\$");
        return value;
    }
 
    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }
    

	@Override
    public void setProperties(Properties properties) {
    }
	
	/**允许输出SQL*/
    public void setPrintSql(String printSql) {
		this.printSql = "true".equals(printSql);
	}

	public SqlInterceptor(boolean printSql, AfterCrud afterCrud) {
		super();
		this.printSql = printSql;
		this.afterCrud = afterCrud;
	}
    
    
}