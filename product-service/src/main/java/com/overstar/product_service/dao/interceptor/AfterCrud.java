/**
 * 创建日期 2019年1月24日 下午7:11:02 
 *
 * 成都澳乐科技有限公司
 * 电话：028-85253121 
 * 传真：028-85253121
 * 邮编：610041 
 * 地址：成都市武侯区航空路6号丰德国际C3
 * 版权所有
 */
package com.overstar.product_service.dao.interceptor;

import org.apache.ibatis.mapping.SqlCommandType;

/**
 * 数据库crud后的一些操作
 * @author Sean.Yang
 *
 */
public interface AfterCrud {
	
	/**插入操作*/
	String INSERT = "insert";
	/**更新操作*/
	String UPDATE = "update";
	/**删除操作*/
	String DELETE = "delete";

	/**
	 * 数据库crud后的操作
	 * @param sqlId 数据库sqlId
	 * @param sqlCommandType 操作类型
	 * @param args 参数，一般第二个参数为传给sql的参数，第一个是MappedStatement
	 */
	void action(String sqlId, SqlCommandType sqlCommandType, Object[] args);
}
