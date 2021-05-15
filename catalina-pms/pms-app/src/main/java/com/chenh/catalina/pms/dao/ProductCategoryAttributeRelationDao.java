package com.chenh.catalina.pms.dao;

import com.chenh.common.mybatis.model.PmsProductCategoryAttributeRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自定义商品分类和属性关系Dao
 * @author chenh
 * @date 2021年04月22日
 */
public interface ProductCategoryAttributeRelationDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsProductCategoryAttributeRelation> productCategoryAttributeRelationList);
}