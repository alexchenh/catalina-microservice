package com.chenh.admin.config;

import com.chenh.common.core.config.BaseSwaggerConfig;
import com.chenh.common.core.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档配置
 * @author chenh
 * @date 2021年05月13日
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.chenh.admin.controller")
                .title("后台管理")
                .description("后台管理相关接口文档")
                .contactName("chenh")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
