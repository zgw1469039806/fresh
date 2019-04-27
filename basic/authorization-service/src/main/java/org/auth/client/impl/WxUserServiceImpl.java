package org.auth.client.impl;

import org.apache.ibatis.annotations.Insert;
import org.auth.client.entity.GdUser;
import org.auth.client.fegin.WxVipFeginService;
import org.auth.client.mapper.GdUserMapper;
import org.auth.client.utils.HttpClientUtil;
import org.auth.client.utils.JsonUtils;
import org.fresh.gd.commons.consts.api.wx.GdWxUserService;
import org.fresh.gd.commons.consts.consts.Consts;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.oauth.GdPositionDTO;
import org.fresh.gd.commons.consts.pojo.dto.oauth.UserDTO;
import org.fresh.gd.commons.consts.pojo.dto.oauth.WXUserDTO;
import org.fresh.gd.commons.consts.pojo.dto.user.RoleAndUserDTO;
import org.fresh.gd.commons.consts.pojo.dto.user.UserAndVipDTO;
import org.fresh.gd.commons.consts.pojo.dto.vip.GdAddVipDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 贾轶飞
 * @date 2019/4/24 9:41
 */
@RestController
public class WxUserServiceImpl implements GdWxUserService {

    @Autowired
    GdUserMapper gdUserMapper;

    @Autowired
    WxVipFeginService wxVipFeginService;


    /**
     * 功能描述:微信用户第一次登陆在数据库创建用户记录
     *
     * @param: [requestData]
     * @return: org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
     * @auther: 贾轶飞
     * @date: 2019/4/24 14:35
     */
    @Override
    public ResponseData<Integer> wxsaveUser(@RequestBody RequestData<WXUserDTO> requestData) {

        ResponseData<Integer> responseData = new ResponseData<>();

        WXUserDTO userDTO = requestData.getData();
        Integer user = gdUserMapper.wxUsercount(userDTO.getUseraccount());
        if (user == 0) {
            GdUser gdUser = new GdUser();
            BeanUtils.copyProperties(userDTO, gdUser);
            Integer wxusersave = gdUserMapper.wxsaveUser(gdUser);
            if (wxusersave > 0) {
                responseData.setMsg(Consts.Result.SUCCESS.getMsg());
                return responseData;
            }
            responseData.setMsg(Consts.Result.BIZ_ERROR.getMsg());
            return responseData;
        } else {

            responseData.setMsg("用户已存在");
            return responseData;
        }

    }


    /**
     * 功能描述:获取微信唯一凭证Openid
     *
     * @param: [code]
     * @return: org.fresh.gd.commons.consts.pojo.ResponseData<org.fresh.gd.commons.consts.pojo.dto.oauth.WXUserDTO>
     * @auther: 贾轶飞
     * @date: 2019/4/24 14:36
     */
    @Override
    public ResponseData<WXUserDTO> acquireOpenId(String code) {
        System.out.println("wxLogin - code:" + code);

        String url = "https://api.weixin.qq.com/sns/jscode2session?";
        Map<String, String> param = new HashMap<>();
        param.put("appid", "wxc184dbe65e57f5c3");
        param.put("secret", "3e807b74e45684d4c3f4391c49a20376");
        param.put("js_code", code);
        param.put("grant_type", "authorization_code");
        String wxResult = HttpClientUtil.doGet(url, param);
        System.out.println(wxResult);
        WXUserDTO model = JsonUtils.jsonToPojo(wxResult, WXUserDTO.class);
        ResponseData<WXUserDTO> responseData = new ResponseData<>();
        responseData.setData(model);
        return responseData;
    }


    /**
     * 功能描述: 根据账号查询用户详细
     *
     * @param: [useraccount] 用户账号
     * @return: org.fresh.gd.commons.consts.pojo.ResponseData<org.fresh.gd.commons.consts.pojo.dto.oauth.WXUserDTO>
     * @auther: 贾轶飞
     * @date: 2019/4/24 14:41
     */
    @Override
    public ResponseData<UserDTO> userinfo(String useraccount) {

        ResponseData<UserDTO> responseData = new ResponseData<>();
        UserDTO userDTO = gdUserMapper.sellwxUserAcc(useraccount);
        responseData.setData(userDTO);

        return responseData;
    }

    /**
     * 功能描述: 用户绑定会员
     *
     * @param: [requestData]
     * @return: org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
     * @auther: 贾轶飞
     * @date: 2019/4/24 15:35
     */
    @Override
    public ResponseData<Integer> bindMember(@RequestBody RequestData<UserAndVipDTO> requestData) {

        GdUser gu = gdUserMapper.selUserAcc(requestData.getData().getUseraccount());
        UserAndVipDTO uad = new UserAndVipDTO();
        uad.setUserId(gu.getUserId());
        requestData.setData(uad);
        ResponseData<Integer> responseData = new ResponseData<>();
        ResponseData<UserAndVipDTO> responseData1 = wxVipFeginService.selectOne(requestData);

        if (responseData1.getData().getVipId() == null) {
            UserAndVipDTO userDTO = requestData.getData();

            GdUser gdUser = new GdUser();
            BeanUtils.copyProperties(userDTO, gdUser);
            Integer wxusersave = gdUserMapper.wxsaveUser(gdUser);
            if (wxusersave > 0) {
                responseData.setMsg(Consts.Result.SUCCESS.getMsg());
                return responseData;
            }
            responseData.setMsg(Consts.Result.BIZ_ERROR.getMsg());
            return responseData;
        } else {

            responseData.setMsg("该会员卡号已被绑定");
            return responseData;
        }

    }


}
