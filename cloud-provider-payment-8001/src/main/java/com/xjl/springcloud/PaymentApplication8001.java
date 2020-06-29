package com.xjl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @className: PayMentApplication
 * @description:
 * @author: xiaojinlu
 * @create: 2020-06-03 23:06
 */
@SpringBootApplication
@ComponentScan({"com.xjl.springcloud"})
public class PaymentApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8001.class,args);
    }
}
