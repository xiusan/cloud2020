package com.xjl.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

 /**
  *
  * @Author xiaojinlu
  * @Description 
  * @Date 2020/7/18 22:10
  * @Param 
  * @return 
  **/
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527
{
    public static void main(String[] args) {
            SpringApplication.run(GateWayMain9527.class, args);
    }
}
