package com.overstar.product_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * 线程池配置
 */
@Configuration
@EnableAsync
public class ExecutorConfig {
    public static final String COMMON_EXECUTOR = "commonExecutor";

    @Bean(COMMON_EXECUTOR)
    public Executor commonExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(4);
        executor.setMaxPoolSize(6);
        executor.setKeepAliveSeconds(60);
        executor.setThreadNamePrefix(COMMON_EXECUTOR + "-");
        return executor;
    }


}
