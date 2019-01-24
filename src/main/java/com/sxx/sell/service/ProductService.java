package com.sxx.sell.service;

import com.sxx.sell.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {

    ProductInfo findOne(String productId);
    
    /**
     * @Author
     * @Description //TODO 查询在架商品列表
     * @Date 15:00 2019-01-23
     * @Param []
     * @return java.util.List<com.sxx.sell.dataobject.ProductInfo>
    **/
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //增加库存

    //减少库存
}
