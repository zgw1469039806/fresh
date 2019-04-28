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
     *   会员姓名
     */
    @ApiModelProperty("会员姓名")
    private String vipName;

    /**
     * 会员等级
     */
    @ApiModelProperty("会员初始等级")
    private Integer viplv;

    /**
     * 会员积分
     */
    @ApiModelProperty("会员初始积分")
    private String vipintegral;

    /**
     * 会员余额
     */
    @ApiModelProperty("会员余额")
    private String vipbalance;



    /**
     * 会员手机号
     */
    @ApiModelProperty("会员手机号")
    private String vipphone;
}
