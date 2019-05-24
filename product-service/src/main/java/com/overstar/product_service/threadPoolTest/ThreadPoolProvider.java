package com.overstar.product_service.threadPoolTest;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import static com.overstar.product_service.config.ExecutorConfig.COMMON_EXECUTOR;

/**
 * @Description
 * @Author stanley.yu
 * @Date 2019/5/24 9:57
 */
@Service
public class ThreadPoolProvider {

    /***
     * 第二个
     */
    @Async("blockingQueuePool")
    public void blockingQueuePool(){
        String name = Thread.currentThread().getName();
        System.out.println(name);
    }

    @Async("cacheQueuePool")
    public void cacheQueuePool(){
        String name = Thread.currentThread().getName();
        System.out.println(name);
    }

    @Async("cacheQueuePoolWithFactory")
    public void cacheQueuePoolWithFactory(){
        String name = Thread.currentThread().getName();
        System.out.println(name);
    }

    @Async(COMMON_EXECUTOR)
    public void common_executor(){
        String name = Thread.currentThread().getName();
        System.out.println(name);
    }
}
