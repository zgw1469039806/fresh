package org.auth.server.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author guowei.zhang
 * @since 2019-04-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class GdUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId("userId")
    private Integer userId;

    /**
     * 用户姓名
     */
    private String username;

    /**
     * 账号
     */
    private String useraccount;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 是否为会员;0为不是，1为是
     */
    @TableField("isnoVip")
    private String isnoVip;

    /**
     * 是否为员工;0为不是，1为是
     */
    @TableField("isnoYg")
    private String isnoYg;

    /**
     * 收货地址ID
     */
    private Integer takedelivery;


}
