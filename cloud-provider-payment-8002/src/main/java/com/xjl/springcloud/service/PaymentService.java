package com.xjl.springcloud.service;

import com.xjl.springcloud.entity.Payment;

/**
 * @Author xiaojinlu
 * @Description
 * @Date 2020/7/17 23:25
 * @Param
 * @return
 **/

public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById( Long id);
}