package org.fresh.gd.commons.consts.pojo.dto.vip;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @Auther: 夏乾航 email:xqh151@163.com
 * @Date: 2019/4/29 15:31
 * @Description: 返回vip分页
 */
@ApiModel("返回DTO-返回vip分页")
@Data
public class VipPageDTO {

    /**
     * 会员ID;会员ID
     */
    private String vipId;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     *   会员名称
     */
    private String vipName;

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
    private String vipStartTime;

    /**
     * 是否挂失;0为没挂失，1为挂失
     */
    private Integer vipreport;

    /**
     * 挂失时间
     */
    private String vipeportTime;

    /**
     * 会员手机号
     */
    private String vipphone;

}
