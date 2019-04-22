package org.auth.server.impl;

import lombok.extern.slf4j.Slf4j;
import org.auth.server.entity.GdUser;
import org.auth.server.mapper.GdUserMapper;
import org.fresh.gd.commons.consts.exceptions.BizException;
import org.fresh.gd.commons.consts.pojo.dto.user.RoleAndUserDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * @DATA 2019-04-15 08:50
 * @Author 张国伟  WeChat:17630376104
 * @Description 自定义登录
 */
@Slf4j
@Component
public class UserDetilsService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    GdUserMapper gdUserMapper;

    @Override
    public UserDetails loadUserByUsername(String usernmae) throws UsernameNotFoundException {
        RoleAndUserDTO roleAndUserDTO=gdUserMapper.selUserAndRole(usernmae);
        if (roleAndUserDTO == null){
            throw new BizException("用户不存在");
        }
        return new User(usernmae,roleAndUserDTO.getPassword(), AuthorityUtils.commaSeparatedStringToAuthorityList(roleAndUserDTO.getRolename()));
    }



}
