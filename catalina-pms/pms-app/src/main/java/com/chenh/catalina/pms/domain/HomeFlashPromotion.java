package com.chenh.catalina.pms.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * 首页当前秒杀场次信息
 * @author chenh
 * @date 2021年05月01日
 */
@Getter
@Setter
public class HomeFlashPromotion {
    private Date startTime;
    private Date endTime;
    private Date nextStartTime;
    private Date nextEndTime;
    //属于该秒杀活动的商品
    private List<FlashPromotionProduct> productList;
}
