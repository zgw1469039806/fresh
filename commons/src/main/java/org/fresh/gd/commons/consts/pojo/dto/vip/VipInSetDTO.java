package org.fresh.gd.commons.consts.pojo.dto.vip;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @Auther: 夏乾航 email:xqh151@163.com
 * @Date: 2019/4/27 11:07
 * @Description: 会员积分规则设置dto
 */

@ApiModel("会员积分规则设置dto")
@Data
public class VipInSetDTO {

    /**
     *会员规则所属店铺
     */
    @NotEmpty
    @ApiModelProperty("会员规则所属店铺")
    private Integer storeid;

    /**
     *  客户每消费多少元
     */
    @NotEmpty
    @ApiModelProperty("客户每消费多少元")
    private String vipinsetmoney;

    /**
     *  获得多少积分
     */
    @NotEmpty
    @ApiModelProperty("获得多少积分")
    private Integer vipinsetgetin;

}
