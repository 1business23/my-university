package com.my.university.information;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Describe 个人信息主启动类
 * @Author haitao
 * @Date 2021/6/2 14:50
 * @Version 1.0
 */
@SpringBootApplication
@EnableCaching
@EnableScheduling
public class MyInformationApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyInformationApplication.class, args);
    }
}
