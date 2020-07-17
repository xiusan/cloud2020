package com.xjl.springcloud.dao;

import com.xjl.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author xiaojinlu
 */
@Mapper
public interface PaymentDao {
     int create(Payment payment);

     Payment getPaymentById(@Param("id") Long id);
}