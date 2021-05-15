package com.chenh.catalina.pms.dao;

import com.chenh.catalina.pms.domain.PromotionProduct;
import com.chenh.catalina.pms.dto.CartProduct;
import com.chenh.catalina.pms.dto.ProductResult;
import com.chenh.common.mybatis.model.SmsCoupon;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自定义商品Dao
 * @author chenh
 * @date 2021年05月02日
 */
public interface ProductDao {

    /**
     * 获取商品编辑信息
     */
    ProductResult getUpdateInfo(@Param("id") Long id);


    //-----------------前台-----------------

    /**
     * 获取购物车商品信息
     */
    CartProduct getCartProduct(@Param("id") Long id);

    /**
     * 获取促销商品信息列表
     */
    List<PromotionProduct> getPromotionProductList(@Param("ids") List<Long> ids);

    /**
     * 获取可用优惠券列表
     */
    List<SmsCoupon> getAvailableCouponList(@Param("productId") Long productId, @Param("productCategoryId") Long productCategoryId);

}
