package com.gatesma.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright (C), 2020
 * FileName: FeignConfig
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/3/16 13:55
 * Description:
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }


}
