package org.auth.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.AuthorizationRequest;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @DATA 2019-04-12 15:33
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@Controller
public class AuthorizationController {

    @Autowired
    private TokenStore tokenStore;

    @GetMapping("/oauth/confirm_access")
    public String confirmAccess(HttpSession session, Map<String, Object> model, HttpServletRequest request) {
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) session.getAttribute("authorizationRequest");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        model.put("auth", authentication);
      //  LinkedHashMap<String, String> linkedHashMap = (LinkedHashMap<String, String>) request.getAttribute("scope");
       // model.put("scopes", linkedHashMap.keySet());
        model.put("scopes",authorizationRequest.getClientId());
        return "auth/base-grant";
    }

}
