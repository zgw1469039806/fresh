package org.fresh.gd.commons.consts.pojo.dto.vip;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @Auther: 夏乾航 email:xqh151@163.com
 * @Date: 2019/4/24 16:05
 * @Description: 新增vip等级DTO
 */

@ApiModel("新增vip等级数据模型")
@Data
public class GdAddVipLvDTO {

    /**
    *  会员等级
    */
    @NotEmpty
    @ApiModelProperty("会员等级")
    private Integer viplv;

    /**
     * 会员折扣;1为9折，2为8
     */
    @NotEmpty
    @ApiModelProperty("会员折扣")
    private Double vipdiscount;

    /**
     * 所需积分
     */
    @NotEmpty
    @ApiModelProperty("会员升级所需积分")
    private Integer vipintegration;

}
