package com.overstar.product_service.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @Description 自动装配
 * @Author stanley.yu
 * @Date 2019/5/22 22:10
 */
@Configuration
@ConditionalOnProperty(name = {"dubbo.zookeeper.address","dubbo.name"})
@ImportResource("classpath:dubbo-interfaces.xml")
public class DubboAutoConfiguration {

}
