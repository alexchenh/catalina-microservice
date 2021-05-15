package com.chenh.catalina.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CatalinaPmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CatalinaPmsApplication.class, args);
    }

}
