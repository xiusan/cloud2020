package com.xjl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @className: PayMentApplication
 * @description:
 * @author: xiaojinlu
 * @create: 2020-06-03 23:06
 */
@SpringBootApplication
@EnableHystrixDashboard
public class CloudConsumerHystrixDashboard9001 {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerHystrixDashboard9001.class,args);
    }
}
