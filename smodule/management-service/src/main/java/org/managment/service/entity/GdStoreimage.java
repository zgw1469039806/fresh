package org.managment.service.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
 * @since 2019-04-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("gd_storeImage")
public class GdStoreimage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 门店ID
     */
    private String storeid;

    /**
     * 图片链接
     */
    @TableField("storeImages")
    private String storeImages;


}
