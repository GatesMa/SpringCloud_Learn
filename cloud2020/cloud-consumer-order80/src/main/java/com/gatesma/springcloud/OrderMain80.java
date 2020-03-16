package com.gatesma.springcloud;

import com.gatesma.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

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
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class OrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }

}
