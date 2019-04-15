package org.fresh.gd.commons.consts.pojo.dto.user;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @DATA 2019-04-15 08:16
 * @Author 张国伟  WeChat:17630376104
 * @Description 用户权限
 */
@Data
@ApiModel("用户权限信息")
public class RoleAndUserDTO {

    /**
     * 用户ID
     */
    @ApiModelProperty("用户ID")
    private Integer userId;

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

    /**
     * 是否为会员;0为不是，1为是
     */
    @ApiModelProperty("是否为会员;0为不是，1为是")
    private String isnoVip;

    /**
     * 是否为员工;0为不是，1为是
     */
    @ApiModelProperty("是否为员工;0为不是，1为是")
    private String isnoYg;

    /**
     * 收货地址ID
     */
    @ApiModelProperty("收货地址ID")
    private Integer takedelivery;

    /**
     * 权限ID
     */
    @ApiModelProperty("权限ID")
    private Integer roleid;

    /**
     * 权限名称
     */
    @ApiModelProperty("权限名称")
    private String rolename;


    /**
     * 角色名称
     */
    @ApiModelProperty("角色名称")
    private String pname;


}
