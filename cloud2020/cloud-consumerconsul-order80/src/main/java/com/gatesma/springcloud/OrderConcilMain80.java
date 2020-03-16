package com.gatesma.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Copyright (C), 2020
 * FileName: OrderConcilMain80
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/3/16 10:32
 * Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConcilMain80 {


    public static void main(String[] args) {
        SpringApplication.run(OrderConcilMain80.class, args);
    }

}
