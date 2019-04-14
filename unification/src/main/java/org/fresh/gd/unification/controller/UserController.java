package org.fresh.gd.unification.controller;


import lombok.extern.slf4j.Slf4j;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.unification.fegin.shoping.ShopingFeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Date;

/**
 * @DATA 2019-04-12 10:01
 * @Author 张国伟  WeChat:17630376104
 * @Description 用户
 */
@Slf4j
@RestController
public class UserController {

    @Autowired
    ShopingFeginService shopingFeginService;

    @RequestMapping("/userinfo")
    public ResponseData<Object> userinfo(Authentication authentication) {
        ResponseData<Object> responseData = new ResponseData<>();
        responseData.setData(authentication);
        return responseData;
    }

    @ResponseBody
    @RequestMapping("/lll")
    public String test() {
        return shopingFeginService.shop();
    }

    @PreAuthorize("hasRole('USER')")
    @RequestMapping("/sq")
    public String sq() {
        return "sq";
    }

    @RequestMapping("/getPrinciple")
    public OAuth2Authentication getPrinciple(OAuth2Authentication oAuth2Authentication,
                                             Principal principal, Authentication authentication) {
        log.info(oAuth2Authentication.getUserAuthentication().getAuthorities().toString());
        log.info(oAuth2Authentication.toString());
        log.info("principal.toString()"+principal.toString());
        log.info("principal.getName()"+principal.getName());
        log.info("authentication"+authentication.toString());
        return oAuth2Authentication;
    }

}
