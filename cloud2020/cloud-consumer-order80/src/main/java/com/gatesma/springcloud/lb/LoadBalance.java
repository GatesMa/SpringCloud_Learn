package com.gatesma.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * Copyright (C), 2020
 * FileName: LoadBalance
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/3/16 12:15
 * Description:
 */
public interface LoadBalance {

    ServiceInstance instance(List<ServiceInstance> serviceInstances);

}
