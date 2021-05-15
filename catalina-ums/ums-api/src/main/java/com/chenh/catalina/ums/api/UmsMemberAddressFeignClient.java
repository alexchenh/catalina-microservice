package com.chenh.catalina.ums.api;

import com.chenh.common.core.api.CommonResult;
import com.chenh.common.mybatis.model.UmsMemberReceiveAddress;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "catalina-ums",contextId = "address")
public interface UmsMemberAddressFeignClient {

    /**
     * 获取地址详情
     */
    @GetMapping("/member/address/{id}")
    CommonResult<UmsMemberReceiveAddress> getById(@PathVariable("id") Long id);


    @GetMapping("/member/address/list")
    CommonResult<List<UmsMemberReceiveAddress>> list(@RequestParam Long memberId);

}


