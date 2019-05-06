package org.fresh.gd.commons.consts.pojo.dto.shoping;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @DATA 2019-04-29 15:16
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@ApiModel("活动商品信息")
@Data
public class GdActivitiesAndShopDTO
{
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
     * 活动id
     */
    @ApiModelProperty("活动id")
    private Integer activityId;

    /**
     * 活动名称
     */
    @ApiModelProperty("活动名称")
    private String activityname;

    /**
     * 活动描述
     */
    @ApiModelProperty("活动描述")
    private String adescription;

    /**
     * 活动图片
     */
    @ApiModelProperty("活动图片")
    private String aimages;


    /**
     * 类型名称
     */
    private String typename;
}
