package com.xjl.springcloud.service;

import com.xjl.springcloud.entity.Payment;

public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById( Long id);
}
