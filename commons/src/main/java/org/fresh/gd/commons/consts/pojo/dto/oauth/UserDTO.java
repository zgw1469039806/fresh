package org.fresh.gd.commons.consts.pojo.dto.oauth;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.fresh.gd.commons.consts.pojo.dto.management.GdStoreDTO;

/**
 * @DATA 2019-04-19 14:06
 * @Author 张国伟  WeChat:17630376104
 * @Description 用户信息
 */
@ApiModel("用户信息")
@Data
public class UserDTO {
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
    @ApiModelProperty("是否为会员")
    private String isnoVip;

    /**
     * 是否为员工;0为不是，1为是
     */
    @ApiModelProperty("是否为员工")
    private String isnoYg;

    /**
     * 收货地址ID
     */
    @ApiModelProperty("收货地址ID")
    private Integer takedelivery;

    /**
     * 员工所在门店
     */
    @ApiModelProperty("员工所在门店")
    private GdStoreDTO gdStoreDTO;

    /**
     * 员工所在门店名称
     */
    @ApiModelProperty("员工所在门店名称")
    private String gdStoreName;

}
