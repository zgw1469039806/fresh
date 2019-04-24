package org.fresh.gd.commons.consts.pojo.dto.oauth;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("微信用户信息")
@Data
public class WXUserDTO {


    /**
     * 微信session_key
     */
    @ApiModelProperty("session_key")
    private String session_key;

    /**
     * 微信openid
     */
    @ApiModelProperty("微信openid")
    private String openid;


    /**
     * 用户姓名
     */
    @ApiModelProperty("用户姓名")
    private String username;

    /**
     * 账号
     */
    @ApiModelProperty("账号")
    private String useraccount;

    /**
     * 密码
     */
    @ApiModelProperty("密码")
    private String password;

    /**
     * 手机号
     */
    @ApiModelProperty("手机号")
    private String phone;



}
