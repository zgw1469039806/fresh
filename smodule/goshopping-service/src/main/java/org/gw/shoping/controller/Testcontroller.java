package org.gw.shoping.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @DATA 2019-04-12 11:05
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@RestController
public class Testcontroller {

    @RequestMapping("/test")
    public Object test(Authentication authentication){
        return authentication;
    }
}
