package org.gw.shoping.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品类型表
 * </p>
 *
 * @author guowei.zhang
 * @since 2019-04-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class GdComditytype implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 类型ID
     */
    @TableId("comditytypeId")
    private Integer comditytypeId;

    /**
     * 类型名称
     */
    private String typename;


}
