package com.overstar.product_service.web;

import com.overstar.product_service.threadPoolTest.ConsumerThreadPool;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author stanley.yu
 * @Date 2019/5/22 22:52
 */
@RestController
public class TestController {

    @Autowired
    private ConsumerThreadPool consumerThreadPool;
    @GetMapping
    public String hello(){
        return "hello ypfect ...";
    }


    @GetMapping("blocking")
    public void testBlockingQueue(){
        consumerThreadPool.testBlockingQueuePool();
    }
}
