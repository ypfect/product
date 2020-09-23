/**
 * 创建日期 2018年8月3日 下午7:12:13 
 *
 * 成都澳乐科技有限公司
 * 电话：028-85253121 
 * 传真：028-85253121
 * 邮编：610041 
 * 地址：成都市武侯区航空路6号丰德国际C3
 * 版权所有
 */
package com.overstar.product_service.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * test jenkins2
 */
@Configuration
public class ApplicationConfig {
	
	@Autowired
	private ApplicationContext context;
	
	@Value("${project.name}")
	private String projectName;
	
	/***
	 * 创建异步任务执行器
	 *
	 * @return
	 */
	@Bean("taskExecutor")
	public TaskExecutor getAsyncExecutor(Environment env) {
		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		taskExecutor.setMaxPoolSize(Integer.valueOf(env.getProperty("spring.asyn.max.size")));
		taskExecutor.setCorePoolSize(Integer.valueOf(env.getProperty("spring.asyn.core.size")));
		taskExecutor.setQueueCapacity(Integer.valueOf(env.getProperty("spring.asyn.queue.size")));
		taskExecutor.initialize();
		return taskExecutor;
	}
	
//	@Bean
//	public ServletRegistrationBean<GroovyServlet> groovyServlet() {
//		ServletRegistrationBean<GroovyServlet> registration = new ServletRegistrationBean<GroovyServlet>(
//				new GroovyServlet());
//		registration.setName("groovyServlet");
//		registration.addUrlMappings(String.format("/%s/groovy", projectName));
//		return registration;
//	}

}
