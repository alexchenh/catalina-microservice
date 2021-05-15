package com.chenh.catalina.pms.service;

import com.chenh.common.mybatis.model.PmsSkuStock;

import java.util.List;

/**
 * 商品SKU库存管理Service
 * @author chenh
 * @date 2021年04月22日
 */
public interface SkuStockService {
    /**
     * 根据产品id和skuCode模糊搜索
     */
    List<PmsSkuStock> getList(Long pid, String keyword);

    /**
     * 批量更新商品库存信息
     */
    int update(Long pid, List<PmsSkuStock> skuStockList);
}
