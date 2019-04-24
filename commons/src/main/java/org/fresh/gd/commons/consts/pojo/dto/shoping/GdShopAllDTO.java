package org.fresh.gd.commons.consts.pojo.dto.shoping;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

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



    /**
     * 商品ID
     */
    @ApiModelProperty("商品ID")
    private Integer comdityId;

    /**
     * 商品名称
     */
    @ApiModelProperty("商品名称")
    private String comdityname;

    /**
     * 商品类别
     */
    @ApiModelProperty("商品类别")
    private Integer comditytypeId;

    /**
     * 商品单位
     */
    @ApiModelProperty("商品单位")
    private String comditydw;

    /**
     * 商品描述
     */
    @ApiModelProperty("商品描述")
    private String comditydescribe;

    /**
     * 商品单价
     */
    @ApiModelProperty("商品单价")
    private String comdityprice;


    /**
     * 是否打折;0为false,2为true
     */
    @ApiModelProperty("是否打折")
    private Integer isnodiscount;

    /**
     * 库存数量
     */
    @ApiModelProperty("库存数量")
    private String stock;

    /**
     * 对应积分
     */
    @ApiModelProperty("对应积分")
    private String corresponding;


    @ApiModelProperty("页码")
    private Integer pageNo;

    @ApiModelProperty("所属门店名")
    private String ssmdName;

    /**
     * 编码
     */
    @ApiModelProperty("编码")
    private String supplierBM;

    /**
     * 名称
     */
    @ApiModelProperty("名称")
    private String supplierName;

}
