package com.overstar.product_service.threadPoolTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author stanley.yu
 * @Date 2019/5/24 9:57
 */
@Service
public class ConsumerThreadPool {

    public static final Logger log = LoggerFactory.getLogger("run");

    @Autowired
    private ThreadPoolProvider provider;

    public void testBlockingQueuePool(){
        int i=500000;
        while (i>0){
            i--;
            log.info("加入线程------{}",i);
//            provider.blockingQueuePool();
//            provider.cacheQueuePool();
//            provider.cacheQueuePoolWithFactory();
            provider.common_executor();
        }
    }
}
