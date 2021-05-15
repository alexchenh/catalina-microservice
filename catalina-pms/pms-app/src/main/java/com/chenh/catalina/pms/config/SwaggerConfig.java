package com.chenh.catalina.pms.config;

import com.chenh.common.core.config.BaseSwaggerConfig;
import com.chenh.common.core.domain.SwaggerProperties;

/**
 * API文档配置
 * @author chenh
 * @date 2021年05月14日
 */
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.chenh.catalina.pms.controller")
                .title("商品中心")
                .description("商品中心相关接口文档")
                .contactName("chenh")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }

}
