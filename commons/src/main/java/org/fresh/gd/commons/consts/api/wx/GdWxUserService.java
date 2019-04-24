package org.fresh.gd.commons.consts.api.wx;

import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.oauth.UserDTO;


import org.fresh.gd.commons.consts.pojo.dto.oauth.WXUserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 贾轶飞
 * @date2019/4/24 9:30
 */
@RequestMapping("/GdWxUserService")
public interface GdWxUserService {


    /**
     * 功能描述:微信用户第一次登陆在数据库创建用户记录
     *
     * @param: [requestData]
     * @return: org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
     * @auther: 贾轶飞
     * @date: 2019/4/24 14:35
     */
    @PostMapping("/wxsaveUser")
    ResponseData<Integer> wxsaveUser(RequestData<WXUserDTO> requestData);

    /**
     * 功能描述:
     *
     * @param: [code]
     * @return: org.fresh.gd.commons.consts.pojo.ResponseData<org.fresh.gd.commons.consts.pojo.dto.oauth.WXSessionDTO>
     * @auther: 贾轶飞
     * @date: 2019/4/24 13:06
     */
    @GetMapping("/wxlogin.do")
    ResponseData<WXUserDTO> acquireOpenId(String code);

    /**
     * 功能描述: 根据账号查询用户详细
     *
     * @param: [useraccount] 用户账号
     * @return: org.fresh.gd.commons.consts.pojo.ResponseData<org.fresh.gd.commons.consts.pojo.dto.oauth.WXUserDTO>
     * @auther: 贾轶飞
     * @date: 2019/4/24 14:41
     */
    @GetMapping("/wxselUser")
    ResponseData<UserDTO> userinfo(String useraccount);



    /**
     * 功能描述: 用户绑定会员
     *
     * @param: [userDTO]
     * @return: org.fresh.gd.commons.consts.pojo.ResponseData<org.fresh.gd.commons.consts.pojo.dto.oauth.UserDTO>
     * @auther: 贾轶飞
     * @date: 2019/4/24 15:32
     */
    @PostMapping("/wxbindMember")
    ResponseData<Integer> bindMember(RequestData<UserDTO> requestData);
}
