package com.chenh.catalina.pms.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author chenh
 * @date 2021年05月14日
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.chenh.common.mbatis.mapper", "com.chenh.catalina.pms.dao"})
public class MyBatisConfig {
}
