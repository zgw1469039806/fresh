package org.gw.shoping.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author guowei.zhang
 * @since 2019-04-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class GdImages implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 图片编号
     */
    @TableId(value = "imagesId", type = IdType.AUTO)
    private Integer imagesId;

    /**
     * 图片地址
     */
    private String imagesurl;

    /**
     * 商品ID
     */
    @TableField("comdityId")
    private Integer comdityId;

    /**
     * 图片等级
     */
    private String imageslv;


}
