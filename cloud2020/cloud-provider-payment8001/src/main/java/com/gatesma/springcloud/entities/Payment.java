package com.gatesma.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Copyright (C), 2020
 * FileName: Payment
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/3/15 13:36
 * Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
