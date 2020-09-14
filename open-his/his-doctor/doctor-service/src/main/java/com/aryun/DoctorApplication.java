package com.aryun;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: 菜菜瑞
 * @Date: 2020/9/13 14:10
 */
@SpringBootApplication
@MapperScan(basePackages = "com.aryun.mapper")
@EnableDubbo
public class DoctorApplication {
    public static void main(String[] args) {
        SpringApplication.run(DoctorApplication.class,args);
        System.out.println("就诊子系统启动成功");
    }
}