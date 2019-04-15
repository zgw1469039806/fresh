package org.auth.client.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 职位表
 * </p>
 *
 * @author guowei.zhang
 * @since 2019-04-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class GdPosition implements Serializable {

    private static final long serialVersionUID = 1L;

       /**
     * 用户ID
     */
    @TableField("userId")
    private Integer userId;

    /**
     * 角色名称
     */
    private String pname;

    /**
     * 权限id
     */
    private Integer roleid;


}
