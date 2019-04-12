package org.gw.shoping;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @DATA 2019-04-11 15:37
 * @Author 张国伟  WeChat:17630376104
 * @Description 启动类
 */

@EnableSwagger2Doc
@MapperScan("org.gw.shoping.mapper")
@EnableDiscoveryClient
@SpringBootApplication
@EnableOAuth2Sso
public class ShoppingApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShoppingApplication.class,args);
    }
}
