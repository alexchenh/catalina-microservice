package com.chenh.catalina.pms.service;

import com.chenh.catalina.pms.dto.HomeContentResult;
import com.chenh.common.mybatis.model.PmsProduct;
import com.chenh.common.mybatis.model.PmsProductCategory;

import java.util.List;

/**
 * 首页内容管理Service
 * @author chenh
 * @date 2021年05月01日
 */
public interface HomeService {
    /**
     * 获取首页内容
     */
    HomeContentResult content();

    /**
     * 分页获取新品推荐商品
     */
    List<PmsProduct> newProductList(Integer pageNum, Integer pageSize);

    /**
     * 分页获取人气推荐商品
     */
    List<PmsProduct> hotProductList(Integer pageNum, Integer pageSize);

    /**
     * 获取商品分类
     * @param parentId 0:获取一级分类；其他：获取指定二级分类
     */
    List<PmsProductCategory> getProductCateList(Long parentId);
}
