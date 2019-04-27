package org.fresh.gd.commons.consts.pojo.dto.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 贾轶飞
 * @dat e2019/4/27 8:51
 *
 */

@Data
@ApiModel("用户绑定会员信息")
public class UserAndVipDTO {

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
     * 会员ID;
     */
    @ApiModelProperty("会员ID")
    private Integer vipId;


    /**
     *   会员名称
     */
    @ApiModelProperty("会员名称")
    private String vipName;

    /**
     * 会员等级
     */
    @ApiModelProperty("会员等级")
    private Integer viplv;

    /**
     * 会员积分
     */
    @ApiModelProperty("会员积分")
    private String vipintegral;

    /**
     * 会员余额
     */
    @ApiModelProperty("会员余额")
    private String vipbalance;

    /**
     * 开卡时间
     */
    @ApiModelProperty("开卡时间")
    private String vipStartTime;

    /**
     * 是否挂失;0为没挂失，1为挂失
     */
    @ApiModelProperty("是否挂失")
    private Integer vipreport;

    /**
     * 挂失时间
     */
    @ApiModelProperty("挂失时间")
    private String vipeportTime;
}
