package com.chenh.catalina.pms.dao;

import com.chenh.catalina.pms.dto.ProductAttrInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自定义商品属性Dao
 * @author chenh
 * @date 2021年04月22日
 */
public interface ProductAttributeDao {
    /**
     * 获取商品属性信息
     */
    List<ProductAttrInfo> getProductAttrInfo(@Param("id") Long productCategoryId);
}
