/**
 * 创建日期 2019年1月24日 下午7:27:00 
 *
 * 成都澳乐科技有限公司
 * 电话：028-85253121 
 * 传真：028-85253121
 * 邮编：610041 
 * 地址：成都市武侯区航空路6号丰德国际C3
 * 版权所有
 */
package com.overstar.product_service.config;

import com.github.pagehelper.PageInterceptor;
import com.github.pagehelper.autoconfigure.PageHelperProperties;
import com.overstar.product_service.dao.interceptor.SqlInterceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Properties;

/**
 * @author Sean.Yang
 *
 */
@Configuration
@EnableConfigurationProperties(PageHelperProperties.class)
public class InterceptorConfig {

	@Autowired
	private List<SqlSessionFactory> sqlSessionFactoryList;

	@Autowired
	private PageHelperProperties properties;
	
	/**
	 * 接受分页插件额外的属性
	 *
	 * @return
	 */
	@Bean
	@ConfigurationProperties(prefix = PageHelperProperties.PAGEHELPER_PREFIX)
	public Properties pageHelperProperties() {
		return new Properties();
	}

	/**
	 * 需要把自定义的拦截器放到page helper的前面
	 */
	@PostConstruct
	public void addPageInterceptor() {
		PageInterceptor interceptor = new PageInterceptor();
		Properties properties = new Properties();
		// 先把一般方式配置的属性放进去
		properties.putAll(pageHelperProperties());
		// 在把特殊配置放进去，由于close-conn 利用上面方式时，属性名就是 close-conn 而不是
		// closeConn，所以需要额外的一步
		properties.putAll(this.properties.getProperties());
		interceptor.setProperties(properties);
		SqlInterceptor sqlInterceptor = new SqlInterceptor(true, null);
		for (SqlSessionFactory sqlSessionFactory : sqlSessionFactoryList) {
			sqlSessionFactory.getConfiguration().addInterceptor(interceptor);
			sqlSessionFactory.getConfiguration().addInterceptor(sqlInterceptor);
		}
	}

}
