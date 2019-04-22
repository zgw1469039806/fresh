package org.gw.shoping.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 进货详细表
 * </p>
 *
 * @author guowei.zhang
 * @since 2019-04-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("gd_Purchase")
public class GdPurchase implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 进货ID
     */
    @TableField("replenishId")
    private Integer replenishId;

    /**
     * 商品ID
     */
    @TableField("shopId")
    private Integer shopId;

    /**
     * 商品数量
     */
    @TableField("shopNumber")
    private Integer shopNumber;

    /**
     * 采购数量
     */
    @TableField("Purchase")
    private Integer purchase;

    /**
     * 赠送数量
     */
    @TableField("GiveNumber")
    private Integer giveNumber;

    /**
     * 采购价
     */
    @TableField("purchasingPrice")
    private String purchasingPrice;

    /**
     * 小计
     */
    private String subtotal;


}
