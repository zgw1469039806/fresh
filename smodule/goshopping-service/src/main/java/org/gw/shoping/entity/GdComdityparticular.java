package org.gw.shoping.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品详细表
 * </p>
 *
 * @author guowei.zhang
 * @since 2019-04-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class GdComdityparticular implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品ID
     */
    @TableId("comdityId")
    private Integer comdityId;

    /**
     * 是否打折;0为false,2为true
     */
    private Integer isnodiscount;

    /**
     * 库存数量
     */
    private String stock;

    /**
     * 对应积分
     */
    private String corresponding;

    /**
     * 所属店铺ID
     */
    private Integer ssdp;


}
