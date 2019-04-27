package org.fresh.gd.commons.consts.pojo.dto.shoping;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @DATA 2019-04-26 16:27
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@ApiModel("货品详细入参")
@Data
public class GdComditynameDTO {

    @ApiModelProperty("商品名称")
    private String comdityname;

    @ApiModelProperty("所属门店ID")
    private Integer storeid;
}
