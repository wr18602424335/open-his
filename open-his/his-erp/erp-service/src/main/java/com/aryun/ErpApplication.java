package com.aryun;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: 菜菜瑞
 * @Date: 2020/9/13 12:25
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.aryun.mapper"})
@EnableDubbo
public class ErpApplication {
    public static void main(String[] args) {
        SpringApplication.run(ErpApplication.class,args);
    }
}