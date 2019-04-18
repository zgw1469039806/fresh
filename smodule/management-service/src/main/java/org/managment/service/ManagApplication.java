package org.managment.service;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @DATA 2019-04-12 09:01
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@EnableFeignClients
@MapperScan("org.managment.service.mapper")
@EnableDiscoveryClient
@SpringBootApplication
public class ManagApplication  extends WebSecurityConfigurerAdapter
{
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
    }

    public static void main(String[] args) {
        SpringApplication.run(ManagApplication.class,args);
    }
}
