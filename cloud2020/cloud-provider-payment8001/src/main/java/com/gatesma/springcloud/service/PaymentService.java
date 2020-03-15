package com.gatesma.springcloud.service;

import com.gatesma.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * Copyright (C), 2020
 * FileName: PaymentService
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/3/15 14:05
 * Description:
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);

}
