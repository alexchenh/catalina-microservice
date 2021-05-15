package com.chenh.catalina.pms.domain;

import com.chenh.common.mybatis.model.PmsProduct;
import com.chenh.common.mybatis.model.PmsProductFullReduction;
import com.chenh.common.mybatis.model.PmsProductLadder;
import com.chenh.common.mybatis.model.PmsSkuStock;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author chenh
 * @date 2021年05月02日
 */
@Getter
@Setter
public class PromotionProduct extends PmsProduct {
    //商品库存信息
    private List<PmsSkuStock> skuStockList;
    //商品打折信息
    private List<PmsProductLadder> productLadderList;
    //商品满减信息
    private List<PmsProductFullReduction> productFullReductionList;
}
