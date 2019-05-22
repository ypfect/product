package com.overstar.product_service.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author stanley.yu
 * @Date 2019/5/22 22:52
 */
@RestController
public class TestController {

    @GetMapping
    public String hello(){
        return "hello ypfect ...";
    }
}
