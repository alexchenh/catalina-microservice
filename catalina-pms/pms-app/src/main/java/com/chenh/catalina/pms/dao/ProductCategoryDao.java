package com.chenh.catalina.pms.dao;

import com.chenh.catalina.pms.dto.ProductCategoryWithChildrenItem;

import java.util.List;

/**
 * 商品分类自定义Dao
 * @author chenh
 * @date 2021年04月22日
 */
public interface ProductCategoryDao {
    /**
     * 获取商品分类及其子分类
     */
    List<ProductCategoryWithChildrenItem> listWithChildren();
}
