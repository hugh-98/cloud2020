package com.atguigu.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author hugh
 * @create 2022-05-21 16:36
 */
@Configuration
@MapperScan("com.atguigu.springcloud.alibaba.dao")
public class MyBatisConfig {
}
