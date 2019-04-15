package org.auth.server.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;

/**
 * @DATA 2019-04-08 17:22
 * @Author 张国伟  WeChat:17630376104
 * @Description 认证服务器配置
 */
@Configuration
public class SsoAuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

    /**
     * 功能描述  认证服务安全配置
     *
     * @param security
     * @return void
     * @author zgw
     */
    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        security.tokenKeyAccess("isAuthenticated()");//当访问的时候 需要身份认证
    }

    /**
     * 功能描述 使配置生成令牌
     *
     * @param endpoints
     * @return void
     * @author zgw
     */
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.tokenStore(tokenStore()).accessTokenConverter(jwtAccessTokenConverter());
    }

    /**
     * 功能描述 能给那些应用发令牌
     *
     * @param clients
     * @return void
     * @author zgw
     */
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("GDSX")
                .secret("zxcv")
                .authorizedGrantTypes("authorization_code", "refresh_token")
                .scopes("all");
    }

    /**
     * 功能描述
     * 配置JWT令牌
     *
     * @param
     * @return org.springframework.security.oauth2.provider.token.TokenStore
     * @author zgw
     */
    @Bean
    public TokenStore tokenStore() {
        return new JwtTokenStore(jwtAccessTokenConverter());
    }

    /**
     * 功能描述
     *
     * @param
     * @return org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter
     * @author zgw
     */
    @Bean
    public JwtAccessTokenConverter jwtAccessTokenConverter() {
        JwtAccessTokenConverter accessTokenConverter = new JwtAccessTokenConverter();
        accessTokenConverter.setSigningKey("qwe");//秘钥签名
        return accessTokenConverter;
    }
}
