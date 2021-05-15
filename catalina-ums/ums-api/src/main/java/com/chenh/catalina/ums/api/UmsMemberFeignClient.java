package com.chenh.catalina.ums.api;

import com.chenh.common.core.domain.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chenh
 * @date 2021年05月08日
 */
@FeignClient("catalina-ums")
public interface UmsMemberFeignClient {
    @GetMapping("/sso/loadByUsername")
    UserDto loadUserByUsername(@RequestParam String username);
}
