package com.chenh.catalina.pms.dao;

import com.chenh.catalina.pms.domain.FlashPromotionProduct;
import com.chenh.common.mybatis.model.PmsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author chenh
 * @date 2021年05月01日
 */
public interface HomeDao {

    /**
     * 获取新品推荐
     */
    List<PmsProduct> getNewProductList(@Param("offset") Integer offset, @Param("limit") Integer limit);
    /**
     * 获取人气推荐
     */
    List<PmsProduct> getHotProductList(@Param("offset") Integer offset,@Param("limit") Integer limit);


    /**
     * 获取秒杀商品
     */
    List<FlashPromotionProduct> getFlashProductList(@Param("flashPromotionId") Long flashPromotionId, @Param("sessionId") Long sessionId);

}
