package org.gd.vip;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @DATA 2019-04-12 09:30
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */

@EnableFeignClients
@EnableDiscoveryClient
@MapperScan("org.gd.vip.mapper")
@SpringBootApplication
public class VipApplication {
    public static void main(String[] args) {
        SpringApplication.run(VipApplication.class,args);
    }
}
