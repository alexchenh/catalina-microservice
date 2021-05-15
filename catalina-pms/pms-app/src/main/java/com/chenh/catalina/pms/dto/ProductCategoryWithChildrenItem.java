package com.chenh.catalina.pms.dto;

import com.chenh.common.mybatis.model.PmsProductCategory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author chenh
 * @date 2021年04月22日
 */
public class ProductCategoryWithChildrenItem extends PmsProductCategory {
    @Getter
    @Setter
    @ApiModelProperty("子级分类")
    private List<PmsProductCategory> children;
}
