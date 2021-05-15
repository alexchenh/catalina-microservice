package com.chenh.catalina.pms.dto;

import com.chenh.common.mybatis.model.PmsProduct;
import com.chenh.common.mybatis.model.PmsProductAttributeValue;
import com.chenh.common.mybatis.model.PmsSkuStock;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author chenh
 * @date 2021年04月22日
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ProductParam extends PmsProduct {
    @ApiModelProperty("商品的sku库存信息")
    private List<PmsSkuStock> skuStockList;
    @ApiModelProperty("商品参数及自定义规格属性")
    private List<PmsProductAttributeValue> productAttributeValueList;
}
