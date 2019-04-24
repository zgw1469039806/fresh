package org.gd.vip.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 会员等级表
 * </p>
 *
 * @author guowei.zhang
 * @since 2019-04-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class GdViplv implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 会员等级
     */
    @TableId("viplv")
    private Integer viplv;

    /**
     * 会员折扣;1为9折，2为8
     */
    private Integer vipdiscount;

    /**
     * 所需积分
     */
    private Integer vipintegration;


}
