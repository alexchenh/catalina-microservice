package com.chenh.catalina.pms.domain;

import com.chenh.catalina.model.PmsProductCategory;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 商品分类，包含子分类
 * @author chenh
 * @date 2021年04月11日
 */
@Getter
@Setter
public class ProductCategoryNode extends PmsProductCategory {
    private List<ProductCategoryNode> children;
}
