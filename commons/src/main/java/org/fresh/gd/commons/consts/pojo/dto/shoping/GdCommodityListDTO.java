package org.fresh.gd.commons.consts.pojo.dto.shoping;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 贾轶飞
 * @data 2019/4/22 14:44
 */
@ApiModel("商品详细数据模型")
@Data
public class GdCommodityListDTO {
    /**
     * 图片编号
     */
    @ApiModelProperty("图片编号")
    private Integer imagesId;

    /**
     * 图片地址
     */
    @ApiModelProperty("图片地址")
    private String imagesurl;

    /**
     * 商品ID
     */
    @ApiModelProperty("图片等级")
    private Integer comdityId;

    /**
     * 图片等级
     */
    @ApiModelProperty("图片等级")
    private String imageslv;


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
     * 商品数
     */
    @ApiModelProperty("商品数")
    private Integer num;

}
