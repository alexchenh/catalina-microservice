package com.chenh.catalina.oms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CatalinaOmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CatalinaOmsApplication.class, args);
    }

}
