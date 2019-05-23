package com.overstar.product_service.service.impl;

import com.overstar.product_export.model.ProductPrice;
import com.overstar.product_export.service.IProductPriceService;
import com.overstar.product_service.mapper.ProductPriceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author stanley.yu
 * @Date 2019/5/22 22:03
 */
@Service
public class ProductPriceServiceImpl implements IProductPriceService {

    @Autowired
    private ProductPriceMapper priceMapper;

    @Override
    public String firstRpc() {
        return "success ...";
    }

    @Override
    public List<ProductPrice> getPriceByProductId(Integer productId) {
        ProductPrice productPrice = new ProductPrice();
        productPrice.setProductId(productId);
        List<ProductPrice> selectedPrice = priceMapper.select(productPrice);
        return selectedPrice;
    }

    @Override
    public List<Integer> getProductIds() {
        return null;
    }
}
