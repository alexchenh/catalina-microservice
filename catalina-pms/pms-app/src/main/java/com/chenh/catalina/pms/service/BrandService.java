package com.chenh.catalina.pms.service;

import com.chenh.catalina.pms.dto.BrandParam;
import com.chenh.common.core.api.CommonPage;
import com.chenh.common.mybatis.model.PmsBrand;
import com.chenh.common.mybatis.model.PmsProduct;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 商品品牌管理Service
 *
 * @author chenh
 * @date 2021年04月22日
 */
public interface BrandService {
    /**
     * 获取所有品牌
     */
    List<PmsBrand> listAllBrand();

    /**
     * 创建品牌
     */
    int createBrand(BrandParam pmsBrandParam);

    /**
     * 修改品牌
     */
    @Transactional
    int updateBrand(Long id, BrandParam pmsBrandParam);

    /**
     * 删除品牌
     */
    int deleteBrand(Long id);

    /**
     * 批量删除品牌
     */
    int deleteBrand(List<Long> ids);

    /**
     * 分页查询品牌
     */
    List<PmsBrand> listBrand(String keyword, int pageNum, int pageSize);

    /**
     * 获取品牌详情
     */
    PmsBrand getBrand(Long id);

    /**
     * 修改显示状态
     */
    int updateShowStatus(List<Long> ids, Integer showStatus);

    /**
     * 修改厂家制造商状态
     */
    int updateFactoryStatus(List<Long> ids, Integer factoryStatus);


    // ----------------------以下为前台接口---------------------------------------------------------------------


    /**
     * 获取品牌详情
     */
    PmsBrand detail(Long brandId);

    /**
     * 分页获取品牌关联商品
     */
    CommonPage<PmsProduct> productList(Long brandId, Integer pageNum, Integer pageSize);
}
