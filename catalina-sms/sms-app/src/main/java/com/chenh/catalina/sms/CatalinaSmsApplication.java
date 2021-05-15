package com.chenh.catalina.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CatalinaSmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CatalinaSmsApplication.class, args);
    }

}
