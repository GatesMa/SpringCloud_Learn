package com.gatesma.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Copyright (C), 2020
 * FileName: OrderFeignMain80
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/3/16 13:47
 * Description:
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class, args);
    }

}
