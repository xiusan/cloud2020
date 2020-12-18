package com.xjl.springcloud.service.impl;

import com.xjl.springcloud.dao.PaymentDao;
import com.xjl.springcloud.entity.Payment;
import com.xjl.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

/**
 * @className: PaymentServiceImpl
 * @description:
 * @author: xiaojinlu
 * @create: 2020-06-04 00:23
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    private final  PaymentDao paymentDao;

    public PaymentServiceImpl(PaymentDao paymentDao) {
        this.paymentDao = paymentDao;
    }

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
