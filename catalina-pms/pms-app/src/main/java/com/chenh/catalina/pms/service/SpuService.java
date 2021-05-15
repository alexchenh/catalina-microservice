package com.chenh.catalina.pms.service;

import com.chenh.catalina.pms.domain.ProductCategoryNode;
import com.chenh.catalina.pms.dto.ProductDetail;
import com.chenh.catalina.pms.dto.ProductParam;
import com.chenh.catalina.pms.dto.ProductQueryParam;
import com.chenh.catalina.pms.dto.ProductResult;
import com.chenh.common.mybatis.model.PmsProduct;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 商品管理Service
 * @author chenh
 * @date 2021年04月22日
 */
public interface SpuService {
    /**
     * 创建商品
     */
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    int create(ProductParam productParam);

    /**
     * 根据商品编号获取更新信息
     */
    ProductResult getUpdateInfo(Long id);

    /**
     * 更新商品
     */
    @Transactional
    int update(Long id, ProductParam productParam);

    /**
     * 分页查询商品
     */
    List<PmsProduct> list(ProductQueryParam productQueryParam, Integer pageSize, Integer pageNum);

    /**
     * 批量修改商品上架状态
     */
    int updatePublishStatus(List<Long> ids, Integer publishStatus);

    /**
     * 批量修改新品状态
     */
    int updateNewStatus(List<Long> ids, Integer newStatus);

    /**
     * 批量删除商品
     */
    int updateDeleteStatus(List<Long> ids, Integer deleteStatus);

    /**
     * 根据商品名称或者货号模糊查询
     */
    List<PmsProduct> list(String keyword);


    // -----------------前台接口---------------------------------------------------

    /**
     * 以树形结构获取所有商品分类
     */
    List<ProductCategoryNode> categoryTreeList();

    /**
     * 获取前台商品详情
     */
    ProductDetail detail(Long id);
}
