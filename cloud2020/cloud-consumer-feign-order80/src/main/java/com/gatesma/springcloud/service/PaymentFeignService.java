package com.gatesma.springcloud.service;

import com.gatesma.springcloud.entities.CommonResult;
import com.gatesma.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Copyright (C), 2020
 * FileName: PaymentFeignService
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/3/16 13:49
 * Description:
 */
@Service
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);


    @GetMapping(value = "/payment/feign/timeout")
    String paymentFeignTimeOut();



}
