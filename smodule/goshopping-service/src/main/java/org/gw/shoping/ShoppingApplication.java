package org.gw.shoping;


import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


/**
 * @DATA 2019-04-11 15:37
 * @Author 张国伟  WeChat:17630376104
 * @Description 启动类
 */
@EnableFeignClients
@MapperScan("org.gw.shoping.mapper")
@EnableDiscoveryClient
@SpringBootApplication
public class ShoppingApplication extends WebSecurityConfigurerAdapter {
    /**
     * 功能描述
     * 分页插件，自动识别数据库类型
     * @param
     * @return com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor
     * @author zgw
     */
    @Bean
    public PaginationInterceptor paginationInterceptor()
    {
        return new PaginationInterceptor();
    }

    @Override
    public void configure(HttpSecurity http) throws Exception
    {
        http.csrf().disable();
    }

    public static void main(String[] args)
    {
        SpringApplication.run(ShoppingApplication.class, args);
    }
}
