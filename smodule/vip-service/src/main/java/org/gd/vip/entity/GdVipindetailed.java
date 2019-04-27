package org.gd.vip.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Auther: 夏乾航 email:xqh151@163.com
 * @Date: 2019/4/26 17:33
 * @Description: 会员积分明细表
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true) // chain 若为true，则setter方法返回当前对象
public class GdVipindetailed implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    *   会员积分明细编号
    */
    @TableId("vipindetailedid")
    private Integer vipindetailedid;

    /**
     *   会员编号
     */
    private Integer vipid;

    /**
     *   会员消费类型
     */
    private String vipindetailedtype;

    /**
     *   会员积分交易数量
     */
    private Integer vipindetailednum;

    /**
     *   会员所属店铺
     */
    private Integer storeid;

}
