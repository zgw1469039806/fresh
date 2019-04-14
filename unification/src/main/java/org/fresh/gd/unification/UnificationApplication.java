package org.fresh.gd.unification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @DATA 2019-04-12 09:50
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableOAuth2Sso
@EnableDiscoveryClient
@EnableFeignClients
@SpringCloudApplication
public class UnificationApplication extends WebSecurityConfigurerAdapter {

    @Bean
    public CsrfTokenRepository tokenRepository() {
        return new CookieCsrfTokenRepository();
    }


    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().csrfTokenRepository(tokenRepository()).requireCsrfProtectionMatcher(request -> request.getRequestURI().contains("/supermall/store/order/create")).and().cors().configurationSource(new CorsConfigurationSource() {
            @Override
            public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {
                CorsConfiguration corsConfiguration = new CorsConfiguration();
                corsConfiguration.setAllowCredentials(true);
                //corsConfiguration.setAllowedOrigins(Arrays.asList(allowedOrigins));
                 //corsConfiguration.addAllowedOrigin("http://localhost:8080");
                corsConfiguration.addAllowedHeader("*");
                corsConfiguration.addAllowedMethod("*");
                return corsConfiguration;
            }
        }).and().authorizeRequests().anyRequest().authenticated();
    }


    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
//        config.addAllowedOrigin("http://localhost:8080");
        //config.setAllowedOrigins(Arrays.asList(allowedOrigins));
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }

    public static void main(String[] args) {
        SpringApplication.run(UnificationApplication.class, args);
    }
}
