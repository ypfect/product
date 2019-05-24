package com.overstar.product_service.task;

import com.overstar.product_export.model.ProductPrice;
import com.overstar.product_export.model.ProductPriceNew;
import com.overstar.product_export.model.ProductSpec;
import com.overstar.product_export.model.ProductSpecTravellertype;
import com.overstar.product_service.mapper.*;
import com.overstar.product_service.utils.Arith;
import org.apache.commons.lang.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static com.overstar.product_service.config.ExecutorConfig.COMMON_EXECUTOR;

/**
 * @Description
 * @Author stanley.yu
 * @Date 2019/5/23 20:52
 */
@Component
public class AsyncService {
    public static final Logger log = LoggerFactory.getLogger("run");
    @Autowired
    private ProductPriceMapper priceMapper;
    @Autowired
    private ProductPriceNewMapper newMapper;
    @Autowired
    private ProductSpecTravellertypeMapper productSpecTravellertypeMapper;
    @Autowired
    private ProductSpecMapper productSpecMapper;

    @Async(COMMON_EXECUTOR)
    public void buildPrice(List<Integer> partitionIds) {
        partitionIds.stream().forEach(productId->{

            ProductSpec spec = new ProductSpec();
            spec.setProductId(productId);
            //查询所有的规格信息
            List<ProductSpec> specs = productSpecMapper.select(spec);
            List<String> specIds = specs.stream().map(ProductSpec::getSpecId).collect(Collectors.toList());
            specIds.stream().forEach(specId->{
                List<ProductPrice> productPricesSpec = new ArrayList<>();
                ProductSpecTravellertype productSpecTravellertype = new ProductSpecTravellertype();
                productSpecTravellertype.setSpecId(specId);
                List<ProductSpecTravellertype> specTravellertypesMappings = productSpecTravellertypeMapper.select(productSpecTravellertype);
                specTravellertypesMappings.stream().forEach(productSpecTravellertype1 -> {
                    List<ProductPrice> productPrices = finallyBuild(productSpecTravellertype1, productId);
                    productPricesSpec.addAll(productPrices);
                });
                //一个规格搞一次
                if (CollectionUtils.isEmpty(productPricesSpec)){
                    return;
                }
                priceMapper.insertList(productPricesSpec);
            });

        });
    }

    /**
     * 没什么求差距
     * @param partitionIds
     */
    @Async("blockingQueuePool")
    public void buildPricenew(List<Integer> partitionIds) {
        partitionIds.stream().forEach(productId->{

            ProductSpec spec = new ProductSpec();
            spec.setProductId(productId);
            //查询所有的规格信息
            List<ProductSpec> specs = productSpecMapper.select(spec);
            List<String> specIds = specs.stream().map(ProductSpec::getSpecId).collect(Collectors.toList());
            specIds.stream().forEach(specId->{
                List<ProductPriceNew> productPricesSpec = new ArrayList<>();
                ProductSpecTravellertype productSpecTravellertype = new ProductSpecTravellertype();
                productSpecTravellertype.setSpecId(specId);
                List<ProductSpecTravellertype> specTravellertypesMappings = productSpecTravellertypeMapper.select(productSpecTravellertype);
                specTravellertypesMappings.stream().forEach(productSpecTravellertype1 -> {
                    List<ProductPriceNew> productPrices = finallyBuildnew(productSpecTravellertype1, productId);
                    productPricesSpec.addAll(productPrices);
                });
                //一个规格搞一次
                if (CollectionUtils.isEmpty(productPricesSpec)){
                    return;
                }
                newMapper.insertList(productPricesSpec);
            });

        });
    }

    private  List<ProductPrice>  finallyBuild(ProductSpecTravellertype productSpecTravellertype1, Integer productId) {
        log.info("processing  product :{}",productId);
        List<ProductPrice> productPrices = new ArrayList<>();
        Date dateBegin = new Date();
        Date dateEnd = DateUtils.addDays(new Date(), 365);
        List<Date> daysBetween2Points = getDaysBetween2Points(dateBegin, dateEnd);
        //每天的数据
        daysBetween2Points.stream().forEach(date -> {
            ProductPrice price = new ProductPrice();
            Double adv = Math.random() * 10 + 1;
            Double costv = Math.random() * 100 + Math.random() * 10;
            price.setProductId(productId);
            price.setBookingDate(date);
            price.setBookingAdvance(adv.byteValue());
            price.setCost(costv);
            price.setStatus(new Integer(1).byteValue());
            price.setTravellerTypeId(productSpecTravellertype1.getTravellerTypeId());
            price.setSalePrice(Arith.scale(costv*1.2,2));
            price.setMarketPrice(Arith.scale(costv*1.5,2));
            price.setSpecId(productSpecTravellertype1.getSpecId());
            price.setCurrencyId(new Integer(9).byteValue());
            productPrices.add(price);
        });

        return productPrices;

    }


    private  List<ProductPriceNew>  finallyBuildnew(ProductSpecTravellertype productSpecTravellertype1, Integer productId) {
        log.info("processing  product :{}",productId);
        List<ProductPriceNew> productPrices = new ArrayList<>();
        Date dateBegin = new Date();
        Date dateEnd = DateUtils.addDays(new Date(), 365);
        List<Date> daysBetween2Points = getDaysBetween2Points(dateBegin, dateEnd);
        //每天的数据
        daysBetween2Points.stream().forEach(date -> {
            ProductPriceNew price = new ProductPriceNew();
            Double adv = Math.random() * 10 + 1;
            Double costv = Math.random() * 100 + Math.random() * 10;
            price.setProductId(productId);
            price.setBookingDate(date);
            price.setBookingAdvance(adv.byteValue());
            price.setCost(costv);
            price.setStatus(new Integer(1).byteValue());
            price.setTravellerTypeId(productSpecTravellertype1.getTravellerTypeId());
            price.setSalePrice(Arith.scale(costv*1.2,2));
            price.setMarketPrice(Arith.scale(costv*1.5,2));
            price.setSpecId(productSpecTravellertype1.getSpecId());
            price.setCurrencyId(new Integer(9).byteValue());
            productPrices.add(price);
        });

        return productPrices;

    }




    /***
     * 获取时间段中的每天
     * @param dateBegin
     * @param dateEnd
     * @return
     */
    public List<Date> getDaysBetween2Points(Date dateBegin, Date dateEnd){
        // 返回的日期集合
        List<Date> days = new ArrayList<>();

        try {
            Calendar tempStart = Calendar.getInstance();
            tempStart.setTime(dateBegin);

            Calendar tempEnd = Calendar.getInstance();
            tempEnd.setTime(dateEnd);
            tempEnd.add(Calendar.DATE, +1);// 日期加1(包含结束)
            while (tempStart.before(tempEnd)) {
                days.add(tempStart.getTime());
                tempStart.add(Calendar.DAY_OF_YEAR, 1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return days;
    }

}
