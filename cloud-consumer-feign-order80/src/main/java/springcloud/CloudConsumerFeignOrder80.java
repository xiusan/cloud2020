package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *  Feign 职责单一与  服务解耦
 * @className: PayMentApplication
 * @description:
 * @author: xiaojinlu
 * @create: 2020-06-03 23:06
 */
@SpringBootApplication
@EnableFeignClients
public class CloudConsumerFeignOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerFeignOrder80.class,args);
    }
}
