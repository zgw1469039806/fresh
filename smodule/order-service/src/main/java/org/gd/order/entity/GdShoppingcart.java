package org.gd.order.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 购物车
 * </p>
 *
 * @author guowei.zhang
 * @since 2019-04-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class GdShoppingcart implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 购物车编号
     */
    private Integer cartid;

    /**
     * 商品ID
     */
    @TableField("comdityId")
    private Integer comdityId;

    /**
     * 所属用户
     */
    private String userid;

    /**
     * 数量
     */
    private Integer num;


}
