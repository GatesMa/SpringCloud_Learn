package com.gatesma.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Copyright (C), 2020
 * FileName: ApplicationContextConfig
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/3/16 10:33
 * Description:
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
