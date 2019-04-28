package org.gd.vip.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Auther: 夏乾航 email:xqh151@163.com
 * @Date: 2019/4/26 17:27
 * @Description: 会员积分增加规则设定表
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true) // chain 若为true，则setter方法返回当前对象
public class GdVipInSet implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    *会员规则所属店铺
    */
    @TableId("storeid")
    private Integer storeid;

    /**
     *  客户每消费多少元
     */
    private String vipinsetmoney;

    /**
     *  获得多少积分
     */
    private Integer vipinsetgetin;

}
