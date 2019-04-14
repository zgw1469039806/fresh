package org.auth.server.security;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.net.URLEncoder;

/**
 * @DATA 2019-04-08 20:43
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@Slf4j
@Component
public class SsoUserDetailsService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        log.debug("密码为"+passwordEncoder.encode("123123"));
        //DB操作
        return new User(s, passwordEncoder.encode("123456"), AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER"));
    }





}
