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
 * @since 2019-04-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class GdSupplier implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "supplierId", type = IdType.AUTO)
    private Integer supplierId;

    /**
     * 编码
     */
    @TableField("supplierBM")
    private String supplierBM;

    /**
     * 名称
     */
    @TableField("supplierName")
    private String supplierName;


}
