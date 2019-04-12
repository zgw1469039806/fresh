package org.gw.shoping.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 入库表
 * </p>
 *
 * @author guowei.zhang
 * @since 2019-04-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class GdStorage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 入库编号
     */
    private Integer storageid;

    /**
     * 进货ID
     */
    @TableField("replenishId")
    private Integer replenishId;

    /**
     * 入库时间
     */
    @TableField("storageTime")
    private String storageTime;

    /**
     * 入库人员ID
     */
    private Integer storageuserid;


}
