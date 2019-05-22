package com.overstar.product_service.mapper;

import com.overstar.product_export.model.ProductBase;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface ProductBaseMapper extends Mapper<ProductBase>, MySqlMapper<ProductBase> {
}