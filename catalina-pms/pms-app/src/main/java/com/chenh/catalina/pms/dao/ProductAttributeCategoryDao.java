package com.chenh.catalina.pms.dao;

import com.chenh.catalina.pms.dto.ProductAttributeCategoryItem;

import java.util.List;

/**
 * 自定义商品属性分类Dao
 * @author chenh
 * @date 2021年04月22日
 */
public interface ProductAttributeCategoryDao {
    /**
     * 获取包含属性的商品属性分类
     */
    List<ProductAttributeCategoryItem> getListWithAttr();
}
