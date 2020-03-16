package com.gatesma.springcloud.service;

import org.springframework.stereotype.Service;

/**
 * Copyright (C), 2020
 * FileName: PaymentFallbackService
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/3/16 19:33
 * Description:
 */
@Service
public class PaymentFallbackService implements PaymentHystrixService {


    @Override
    public String paymentInfo_OK(Integer id) {
        return "-------PaymentFallbackService fall back-paymentInfo_OK,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-------PaymentFallbackService fall back-paymentInfo_TimeOut,o(╥﹏╥)o";
    }

}
