package com.gatesma.springcloud.dao;

import com.gatesma.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Copyright (C), 2020
 * FileName: PaymentDao
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/3/15 13:52
 * Description:
 */
@Mapper
public interface PaymentDao {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);

}