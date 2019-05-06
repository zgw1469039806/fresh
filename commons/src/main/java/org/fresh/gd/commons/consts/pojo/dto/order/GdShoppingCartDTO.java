package org.fresh.gd.commons.consts.pojo.dto.order;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author 贾轶飞
 * @dat e2019/5/6 10:02
 */
public class GdShoppingCartDTO {

    /**
     * 购物车编号
     */
    @ApiModelProperty("购物车编号")
    private Integer cartid;


    /**
     * 所属用户
     */
    @ApiModelProperty("所属用户账号")
    private Integer useraccount;

    /**
     * 数量
     */
    @ApiModelProperty("数量")
    private Integer num;

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
    @TableField("comditytypeId")
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
     * 活动id
     */
    @ApiModelProperty("活动id")
    private Integer activityId;
}
