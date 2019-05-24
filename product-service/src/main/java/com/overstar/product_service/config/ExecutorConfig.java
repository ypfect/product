package com.overstar.product_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.Queue;
import java.util.concurrent.*;

/**
 * 线程池配置
 */
@Configuration
@EnableAsync
public class ExecutorConfig {
    public static final String COMMON_EXECUTOR = "commonExecutor";

    /**
     * 19s
     * @return
     */
    @Bean(COMMON_EXECUTOR)
    public Executor commonExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(20);
        executor.setMaxPoolSize(20);
        executor.setKeepAliveSeconds(60);
        executor.setThreadNamePrefix(COMMON_EXECUTOR + "-");
        return executor;
    }


    /**
     * 23s
     * @return
     */
    @Bean("blockingQueuePool")
    public Executor blockingQueuePool() {
        LinkedBlockingQueue<Runnable> blockingQueue = new LinkedBlockingQueue<>();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(50,50,60, TimeUnit.SECONDS,blockingQueue);
        return threadPoolExecutor;
    }

    /**
     * 20s
     * @return
     */
    @Bean("cacheQueuePool")
    public Executor cacheQueuePool() {
        SynchronousQueue<Runnable> synchronousQueue = new SynchronousQueue<>();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0,50,60, TimeUnit.SECONDS,synchronousQueue);
        return threadPoolExecutor;
    }


    /***
     * 测试500000次调用 执行抛出
     * rejected from java.util.concurrent.ThreadPoolExecutor@222acad[Running, pool size = 30, active threads = 9, queued tasks = 0, completed tasks = 268784]
     * @return
     */
    @Bean("cacheQueuePoolWithFactory")
    public Executor cacheQueuePoolWithFactory() {

        SynchronousQueue<Runnable> synchronousQueue = new SynchronousQueue<>();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 30, 60
                , TimeUnit.SECONDS, synchronousQueue, new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                int i =0;
                Thread thread = new Thread(r);
                thread.setName("factory---thread"+i);
                i++;
                return thread;
            }
        });
        return threadPoolExecutor;
    }


}
