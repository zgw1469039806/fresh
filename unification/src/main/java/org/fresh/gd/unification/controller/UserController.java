package org.fresh.gd.unification.controller;


import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @DATA 2019-04-12 10:01
 * @Author 张国伟  WeChat:17630376104
 * @Description 用户
 */
@RestController
public class UserController {

    @RequestMapping("/userinfo")
    public ResponseData<Object> userinfo(Authentication authentication) {
        ResponseData<Object> responseData = new ResponseData<>();
        responseData.setData(authentication);
        return responseData;
    }
}
