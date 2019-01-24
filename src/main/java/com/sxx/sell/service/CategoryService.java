package com.sxx.sell.service;

import com.sxx.sell.dataobject.ProductCategory;

import java.util.List;

/**
 *  类目
 * 
 * @author syx
 * @date 2018/12/29 14:51
 * @param 
 * @return 
 */
public interface CategoryService {

    ProductCategory getOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
