package com.chenh.catalina.pms.api;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author chenh
 * @date 2021年05月14日
 */
@FeignClient("catalina-pms")
public interface SkuFeignClient {

}
