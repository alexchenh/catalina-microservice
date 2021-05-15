package com.chenh.catalina.pms.service;

import com.chenh.catalina.pms.dto.ProductAttrInfo;
import com.chenh.catalina.pms.dto.ProductAttributeParam;
import com.chenh.common.mybatis.model.PmsProductAttribute;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 商品属性管理Service
 * @author chenh
 * @date 2021年04月22日
 */
public interface ProductAttributeService {
    /**
     * 根据分类分页获取商品属性
     * @param cid 分类id
     * @param type 0->属性；2->参数
     */
    List<PmsProductAttribute> getList(Long cid, Integer type, Integer pageSize, Integer pageNum);

    /**
     * 添加商品属性
     */
    @Transactional
    int create(ProductAttributeParam pmsProductAttributeParam);

    /**
     * 修改商品属性
     */
    int update(Long id, ProductAttributeParam productAttributeParam);

    /**
     * 获取单个商品属性信息
     */
    PmsProductAttribute getItem(Long id);

    /**
     * 批量删除商品属性
     */
    @Transactional
    int delete(List<Long> ids);

    /**
     * 获取商品分类对应属性列表
     */
    List<ProductAttrInfo> getProductAttrInfo(Long productCategoryId);
}
