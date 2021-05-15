package com.chenh.admin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis相关配置
 * @author chenh
 * @date 2021年04月14日
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.chenh.common.mybatis.mapper","com.chenh.admin.dao"})
public class MyBatisConfig {
}
