package com.overstar.product_service.mapper;

import com.overstar.product_export.model.ProductPrice;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface ProductPriceMapper extends Mapper<ProductPrice>, MySqlMapper<ProductPrice> {
}