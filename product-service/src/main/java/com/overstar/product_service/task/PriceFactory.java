package com.overstar.product_service.task;

import com.google.common.collect.Lists;
import com.overstar.product_export.model.ProductPrice;
import com.overstar.product_service.config.ExecutorConfig;
import com.overstar.product_service.mapper.ProductBaseMapper;
import com.overstar.product_service.mapper.ProductPriceMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @Description
 * @Author stanley.yu
 * @Date 2019/5/23 17:27
 */
@Service
@ConditionalOnBean(ExecutorConfig.class)
public class PriceFactory {

    public static final Logger log = LoggerFactory.getLogger("run");

    @Autowired
    private ProductBaseMapper productBaseMapper;
    @Autowired
    private AsyncService asyncService;
    @Autowired
    private ProductPriceMapper priceMapper;

    @PostConstruct
    public void buildPriceInfo(){
        List<Integer> productIds = productBaseMapper.productIds();
        List<List<Integer>> partition = Lists.partition(productIds, 1445);
        int count = priceMapper.selectCount(new ProductPrice());

        if (count>50){
            log.info("data exist ...");
            return;
        }
        partition.stream().forEach(proId->{
            asyncService.buildPricenew(proId);
        });

    }



}
