package com.overstar.product_service.mapper;

import com.overstar.product_export.model.ProductSpec;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface ProductSpecMapper extends Mapper<ProductSpec>, MySqlMapper<ProductSpec> {
}