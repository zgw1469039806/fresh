package org.fresh.gd.commons.consts.pojo.dto.shoping;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 贾轶飞
 * @data 2019/4/22 14:32
 */
@ApiModel("商品图片")
@Data
public class GdImagesDTO {

    /**
     * 图片编号
     */
    @ApiModelProperty("图片编号")
    private Integer imagesId;

    /**
     * 图片地址
     */
    @ApiModelProperty("商品图片Url")
    private String imagesurl;

    /**
     * 商品ID
     */
    @ApiModelProperty("商品ID")
    private Integer comdityId;

    /**
     * 图片等级
     */
    @ApiModelProperty("图片等级")
    private String imageslv;
}
