package com.overstar.product_export.service;

import com.overstar.product_export.model.ProductPrice;

import java.util.List;

/**
 * @Description
 * @Author stanley.yu
 * @Date 2019/5/22 20:29
 */
public interface IProductPriceService {

    String firstRpc();

    List<ProductPrice> getPriceByProductId(Integer productId);

    List<Integer> getProductIds();
}
