package org.gd.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @DATA 2019-04-11 15:40
 * @Author 张国伟  WeChat:17630376104
 * @Description eureka服务端
 */

@EnableEurekaServer
@SpringBootApplication
public class StartEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartEurekaApplication.class,args);
    }
}
