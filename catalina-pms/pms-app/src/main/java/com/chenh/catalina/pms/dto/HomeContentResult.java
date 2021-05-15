package com.chenh.catalina.pms.dto;

import com.chenh.catalina.pms.domain.HomeFlashPromotion;
import com.chenh.common.mybatis.model.PmsProduct;
import com.chenh.common.mybatis.model.SmsHomeAdvertise;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 首页内容返回信息封装
 * @author chenh
 * @date 2021年05月01日
 */
@Getter
@Setter
public class HomeContentResult {
    //轮播广告
    private List<SmsHomeAdvertise> advertiseList;
    //当前秒杀场次
    private HomeFlashPromotion homeFlashPromotion;
    //新品推荐
    private List<PmsProduct> newProductList;
    //人气推荐
    private List<PmsProduct> hotProductList;
}
