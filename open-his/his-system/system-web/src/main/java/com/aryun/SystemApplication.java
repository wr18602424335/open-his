package com.aryun;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: 菜菜瑞
 * @Date: 2020/6/17 12:07
 */
@SpringBootApplication
@EnableDubbo
@MapperScan(basePackages = {"com.aryun.mapper"})
public class SystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class,args);
    }
}