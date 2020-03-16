package com.gatesma.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright (C), 2020
 * FileName: MySelfRule
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/3/16 11:58
 * Description:
 */
@Configuration
public class MySelfRule {


    @Bean
    public IRule myRule(){
        return new RandomRule();
    }

}
