package org.auth.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @DATA 2019-04-12 15:20
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "base-login";
    }
}
