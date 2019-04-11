package org.auth.client.entity;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 收货地址详细
 * </p>
 *
 * @author guowei.zhang
 * @since 2019-04-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class GdTakedelivery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地址编号
     */
    private Integer takedeliveryidid;

    /**
     * 用户编号
     */
    private Integer userid;

    /**
     * 地址
     */
    private String address;

    /**
     * 更新人
     */
    @TableField("UPDATED_BY")
    private String updatedBy;

    /**
     * 更新时间
     */
    @TableField("UPDATED_TIME")
    private LocalDateTime updatedTime;


}
