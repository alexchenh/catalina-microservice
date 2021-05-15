package com.chenh.catalina.pms.dao;

import com.chenh.common.mybatis.model.PmsProductAttributeValue;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品参数，商品自定义规格属性Dao
 * @author chenh
 * @date 2021年04月22日
 */
public interface ProductAttributeValueDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsProductAttributeValue> productAttributeValueList);
}
