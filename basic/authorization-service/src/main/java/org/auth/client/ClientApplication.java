package org.auth.client;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @DATA 2019-04-11 16:28
 * @Author 张国伟  WeChat:17630376104
 * @Description 用户中心
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableSwagger2Doc
@MapperScan("org.auth.client.mapper")
public class ClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class,args);
    }
}
