package org.fresh.gd.unification.tasks;

import feign.Request;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @DATA 2019-04-18 10:58
 * @Author 张国伟  WeChat:17630376104
 * @Description feign超时
 */
@Configuration
public class FeignConfigure {
    public static int connectTimeOutMillis = 12000;//超时时间
    public static int readTimeOutMillis = 12000;

    @Bean
    public Request.Options options()
    {
        return new Request.Options(connectTimeOutMillis, readTimeOutMillis);
    }

    @Bean
    public Retryer feignRetryer()
    {
        return new Retryer.Default();
    }


}
