package com.chenh.auth;

import com.chenh.admin.api.UmsAdminService;
import com.chenh.catalina.ums.api.UmsMemberFeignClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients( basePackageClasses = {UmsAdminService.class, UmsMemberFeignClient.class} )
@SpringBootApplication
public class CatalinaAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(CatalinaAuthApplication.class, args);
    }

}
