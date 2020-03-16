package com.gatesma.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Copyright (C), 2020
 * FileName: HystrixDashboardMain9001
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/3/16 21:06
 * Description:
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain9001.class, args);
    }


}
