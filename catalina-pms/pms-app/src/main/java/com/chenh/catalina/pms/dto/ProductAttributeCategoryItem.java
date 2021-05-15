package com.chenh.catalina.pms.dto;

import com.chenh.common.mybatis.model.PmsProductAttribute;
import com.chenh.common.mybatis.model.PmsProductAttributeCategory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 包含有分类下属性的dto
 * @author chenh
 * @date 2021年04月22日
 */
public class ProductAttributeCategoryItem extends PmsProductAttributeCategory {
    @Getter
    @Setter
    @ApiModelProperty(value = "商品属性列表")
    private List<PmsProductAttribute> productAttributeList;
}