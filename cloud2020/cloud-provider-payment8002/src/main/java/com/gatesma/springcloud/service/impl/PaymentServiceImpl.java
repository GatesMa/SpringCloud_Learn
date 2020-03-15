package com.gatesma.springcloud.service.impl;

import com.gatesma.springcloud.dao.PaymentDao;
import com.gatesma.springcloud.entities.Payment;
import com.gatesma.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Copyright (C), 2020
 * FileName: PaymentServiceImpl
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/3/15 14:06
 * Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
