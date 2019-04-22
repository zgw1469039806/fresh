package org.fresh.gd.commons.consts.pojo.dto.shoping;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @DATA 2019-04-22 15:44
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@ApiModel("进货详情")
@Data
public class GdPurchaseDTO {

    /**
     * 进货ID
     */
    @ApiModelProperty("进货ID")
    private Integer replenishId;
    /**
     * 商品ID
     */
    @ApiModelProperty("商品ID")
    private Integer shopId;

    /**
     * 商品数量
     */
    @ApiModelProperty("商品数量")
    private Integer shopNumber;

    /**
     * 采购数量
     */
    @ApiModelProperty("采购数量")
    private Integer purchase;

    /**
     * 赠送数量
     */
    @ApiModelProperty("赠送数量")
    private Integer giveNumber;

    /**
     * 采购价
     */
    @ApiModelProperty("采购价")
    private String purchasingPrice;

    /**
     * 小计
     */
    @ApiModelProperty("小计")
    private String subtotal;
}
