/**
 * Copyright (c) 2018 LINJUANJUAN TECHNOLOGY Inc. All rights reserved.
 */
package com.codedemo.springevent;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Describe: spring-boot启动类
 * @Author: linjuanjuan
 * @Date: 2018/6/28 14:39
 * @Version: 1.0
 */
@Slf4j
@SpringBootApplication
public class SpringEventApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEventApplication.class, args);
        log.info("========== 启动成功 ==========");
    }

}
