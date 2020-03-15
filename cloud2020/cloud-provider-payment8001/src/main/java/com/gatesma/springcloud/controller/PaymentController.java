package com.gatesma.springcloud.controller;

import com.gatesma.springcloud.entities.CommonResult;
import com.gatesma.springcloud.entities.Payment;
import com.gatesma.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Copyright (C), 2020
 * FileName: PaymentController
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/3/15 14:10
 * Description:
 */
@Slf4j
@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    public CommonResult create(Payment payment) {
        int result = paymentService.create(payment);
        log.info("----- 插入结果Payment： " + result);
        if(result > 0) {
            return new CommonResult(200, "插入数据库成功", result);
        } else {
            return new CommonResult(444, "插入数据库失败", null);
        }
    }

}
