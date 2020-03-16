package com.gatesma.springcloud.controller;

import com.gatesma.springcloud.entities.CommonResult;
import com.gatesma.springcloud.entities.Payment;
import com.gatesma.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Copyright (C), 2020
 * FileName: OrderFeignController
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/3/16 13:56
 * Description:
 */
@RestController
@Slf4j
public class OrderFeignController {


    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeOut(){
        //客户端默认等待1秒钟
        return paymentFeignService.paymentFeignTimeOut();
    }

}
