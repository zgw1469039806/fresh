package org.gd.vip.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 会员表
 * </p>
 *
 * @author guowei.zhang
 * @since 2019-04-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class GdVip implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 会员ID;会员ID
     */
    @TableId("vipId")
    private Integer vipId;

    /**
     * 用户ID
     */
    @TableField("userId")
    private Integer userId;

    /**
     * 会员等级
     */
    private Integer viplv;

    /**
     * 会员积分
     */
    private String vipintegral;

    /**
     * 会员余额
     */
    private String vipbalance;

    /**
     * 开卡时间
     */
    @TableField("vipStartTime")
    private String vipStartTime;

    /**
     * 是否挂失;0为没挂失，1为挂失
     */
    private Integer vipreport;

    /**
     * 挂失时间
     */
    @TableField("vipeportTime")
    private String vipeportTime;


}
