package com.gatesma.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Copyright (C), 2020
 * FileName: ApplicationContextConfig
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/3/15 17:59
 * Description:
 */
@Configuration
public class ApplicationContextConfig {

    @Bean()
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
