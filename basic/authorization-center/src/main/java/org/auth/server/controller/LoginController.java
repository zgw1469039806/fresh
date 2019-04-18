package org.auth.server.controller;

import org.auth.server.entity.GdUser;
import org.auth.server.mapper.GdUserMapper;
import org.fresh.gd.commons.consts.pojo.dto.user.RoleAndUserDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @DATA 2019-04-12 15:20
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@Controller
public class LoginController {
    @Autowired
    GdUserMapper gdUserMapper;

    @GetMapping("/login")
    public String login(){
        return "base-login";
    }


}
