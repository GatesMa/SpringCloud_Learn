package com.gatesma.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Copyright (C), 2020
 * FileName: EurekaApplication7002
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/3/15 20:24
 * Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7002.class, args);
    }
}
