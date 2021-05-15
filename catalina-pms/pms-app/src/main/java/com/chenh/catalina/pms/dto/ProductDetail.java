package com.chenh.catalina.pms.dto;

import com.chenh.common.mybatis.model.*;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 前台商品详情
 * @author chenh
 * @date 2021年05月01日
 */
@Getter
@Setter
public class ProductDetail {
    @ApiModelProperty("商品信息")
    private PmsProduct product;
    @ApiModelProperty("商品品牌")
    private PmsBrand brand;
    @ApiModelProperty("商品属性与参数")
    private List<PmsProductAttribute> productAttributeList;
    @ApiModelProperty("手动录入的商品属性与参数值")
    private List<PmsProductAttributeValue> productAttributeValueList;
    @ApiModelProperty("商品的sku库存信息")
    private List<PmsSkuStock> skuStockList;
}
