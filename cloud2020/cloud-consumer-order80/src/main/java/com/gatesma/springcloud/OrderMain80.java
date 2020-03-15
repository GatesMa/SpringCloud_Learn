package com.gatesma.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Copyright (C), 2020
 * FileName: OrderMain80
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/3/15 17:51
 * Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }

}