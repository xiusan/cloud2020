package com.xjl.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

 /**
  *
  * @Author xiaojinlu
  * @Description 
  * @Date 2020/7/17 23:25
  * @Param 
  * @return 
  **/

import com.xjl.springcloud.entity.Payment;

public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById( Long id);
}