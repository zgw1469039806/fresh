package org.fresh.gd.commons.consts.pojo.dto.shoping;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @DATA 2019-04-24 08:57
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@ApiModel("库存进货商品综合数据模型")
@Data
public class GdShopAllDTO {

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

    @ApiModelProperty("进货详细")
    private List<GdPurchaseDTO> purchases;
}
