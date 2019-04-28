package org.fresh.gd.unification.controller;
import org.fresh.gd.commons.consts.consts.Consts;
import org.fresh.gd.commons.consts.pojo.dto.oauth.AuthSysRoleDTO;
import org.fresh.gd.commons.consts.utils.AuthPrincipalUtils;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @DATA 2019-04-12 13:54
 * @Author 张国伟  WeChat:17630376104
 * @Description 登录
 */
@Controller
public class LoginController {

    @RequestMapping("/")
    public String allReq(Authentication authentication, HttpServletResponse response) {

        return "redirect:http://localhost:8081/#/base";

    }
}
