package org.fresh.gd.commons.consts.pojo.dto.vip;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @Auther: 夏乾航 email:xqh151@163.com
 * @Date: 2019/5/6 10:04
 * @Description: 修改会员信息 请求DTO 处理请求参数
 */

@ApiModel("/修改会员信息-请求DTO-处理请求参数")
@Data
public class VipUpdDTO {

    /**
     * 会员ID;会员ID
     */
    @NotEmpty
    @ApiModelProperty("会员编号")
    private String vipId;

    /**
     * 会员等级
     */
    @NotEmpty
    @ApiModelProperty("会员等级")
    private Integer viplv;

    /**
     * 会员积分
     */
    @NotEmpty
    @ApiModelProperty("会员积分")
    private String vipintegral;

    /**
     * 会员余额
     */
    @NotEmpty
    @ApiModelProperty("会员余额")
    private String vipbalance;

    /**
     * 是否挂失;0为没挂失，1为挂失
     */
    @NotEmpty
    @ApiModelProperty("是否挂失 1/0")
    private Integer vipreport;
}
