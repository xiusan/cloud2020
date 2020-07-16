package springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

 /**
  *
  * @Author xiaojinlu
  * @Description 
  * @Date 2020/7/16 21:28
  * @Param 
  * @return 
  **/
@Configuration
public class FeignConfig
{
    @Bean
    Logger.Level feignLoggerLevel()
    {
        return Logger.Level.FULL;
    }
}
