package com.chenh.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CatalinaGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CatalinaGatewayApplication.class, args);
    }

}
