package org.fresh.gd.commons.consts.pojo.dto.vip;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @Auther: 夏乾航 email:xqh151@163.com
 * @Date: 2019/4/29 15:59
 * @Description:
 */

@ApiModel("参数DTO-会员姓名、等级")
@Data
public class VipPageCountDTO {
    /**
     *   会员名称
     */
    private String vipName;

    /**
     * 会员等级
     */
    private Integer viplv;
}
