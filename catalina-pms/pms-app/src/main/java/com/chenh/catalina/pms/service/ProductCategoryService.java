package com.chenh.catalina.pms.service;

import com.chenh.catalina.pms.dto.ProductCategoryParam;
import com.chenh.catalina.pms.dto.ProductCategoryWithChildrenItem;
import com.chenh.common.mybatis.model.PmsProductCategory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 商品分类管理Service
 * @author chenh
 * @date 2021年04月22日
 */
public interface ProductCategoryService {
    /**
     * 创建商品分类
     */
    @Transactional
    int create(ProductCategoryParam pmsProductCategoryParam);

    /**
     * 修改商品分类
     */
    @Transactional
    int update(Long id, ProductCategoryParam pmsProductCategoryParam);

    /**
     * 分页获取商品分类
     */
    List<PmsProductCategory> getList(Long parentId, Integer pageSize, Integer pageNum);

    /**
     * 删除商品分类
     */
    int delete(Long id);

    /**
     * 根据ID获取商品分类
     */
    PmsProductCategory getItem(Long id);

    /**
     * 批量修改导航状态
     */
    int updateNavStatus(List<Long> ids, Integer navStatus);

    /**
     * 批量修改显示状态
     */
    int updateShowStatus(List<Long> ids, Integer showStatus);

    /**
     * 以层级形式获取商品分类
     */
    List<ProductCategoryWithChildrenItem> listWithChildren();
}
