package org.fresh.gd.commons.consts.pojo.dto.vip;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 贾轶飞
 * @dat e2019/4/26 13:09
 */
@ApiModel("新增vip数据模型")
@Data
public class GdAddVipDTO {
    /**
     * 会员ID;
     */
    @ApiModelProperty("会员ID")
    private Integer vipId;

    /**
     * 用户ID
     */
    @ApiModelProperty("用户ID")
    private Integer userId;

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
