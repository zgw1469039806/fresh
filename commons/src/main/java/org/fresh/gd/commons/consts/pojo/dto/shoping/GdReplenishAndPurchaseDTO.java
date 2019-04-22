package org.fresh.gd.commons.consts.pojo.dto.shoping;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @DATA 2019-04-22 16:07
 * @Author 张国伟  WeChat:17630376104
 * @Description 进货详情and进货表
 */
@ApiModel("进货详情and进货表")
@Data
public class GdReplenishAndPurchaseDTO {
    /**
     * 进货ID
     */
    @ApiModelProperty("进货ID")
    private Integer replenishId;
    /**
     * 进货时间
     */
    @ApiModelProperty("进货时间")
    private String replenishTime;
    /**
     * 采购人员id
     */
    @ApiModelProperty("采购人员id")
    private String username;
    /**
     * 店铺ID
     */
    @ApiModelProperty("店铺ID")
    private Integer storeid;
    /**
     * 提供商id
     */
    @ApiModelProperty("提供商id")
    private Integer supplierID;
    /**
     * 是否入库
     */
    @ApiModelProperty("是否入库")
    private Integer isnostorage;
    /**
     * 进货编号
     */
    @ApiModelProperty("进货编号")
    private String receiptNo;
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
