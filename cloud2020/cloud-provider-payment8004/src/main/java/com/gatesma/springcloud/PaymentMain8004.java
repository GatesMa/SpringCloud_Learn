package com.gatesma.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Copyright (C), 2020
 * FileName: PaymentMain8001
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/3/15 12:52
 * Description: payment service 8001 服务
 */
@SpringBootApplication
@EnableDiscoveryClient //该注解用于向使用concul或者zookeeper作为注册中心时注册服务
public class PaymentMain8004 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class, args);
    }

}
