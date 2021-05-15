package com.chenh.catalina.pms.dto;

import com.chenh.common.mybatis.model.PmsProduct;
import com.chenh.common.mybatis.model.PmsProductAttribute;
import com.chenh.common.mybatis.model.PmsSkuStock;

import java.util.List;

/**
 * 购物车中选择规格的商品信息
 * @author chenh
 * @date 2021年05月01日
 */
public class CartProduct extends PmsProduct {
    private List<PmsProductAttribute> productAttributeList;
    private List<PmsSkuStock> skuStockList;

    public List<PmsProductAttribute> getProductAttributeList() {
        return productAttributeList;
    }

    public void setProductAttributeList(List<PmsProductAttribute> productAttributeList) {
        this.productAttributeList = productAttributeList;
    }

    public List<PmsSkuStock> getSkuStockList() {
        return skuStockList;
    }

    public void setSkuStockList(List<PmsSkuStock> skuStockList) {
        this.skuStockList = skuStockList;
    }

}
