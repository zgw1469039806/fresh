package org.gd.vip.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;
import org.fresh.gd.commons.consts.pojo.dto.vip.VipInSetDTO;
import org.gd.vip.entity.GdVipInSet;

/**
 * @Auther: 夏乾航 email:xqh151@163.com
 * @Date: 2019/4/27 10:18
 * @Description: 会员积分增加规则设定mapper
 */
@Mapper
public interface GdVipInSetMapper extends BaseMapper<GdVipInSet> {

    /**
    *
    * 功能描述:
    *   根据店铺id修改积分规则
    * @param: [vipInSetDTO]
    * @return: java.lang.Integer
    * @auther: Mr.Xia
    * @date: 2019/4/27 11:47
    */
    @Update("update gd_vipinset set vipinsetmoney = #{vipinsetmoney} , vipinsetgetin = #{vipinsetgetin} where storeid = #{storeid}")
    Integer updGdVipInSet(VipInSetDTO vipInSetDTO);

    /**
    *
    * 功能描述:
    *   初始化积分规则  在创建新店铺时一并调用此方法
    * @param: [vipInSetDTO]
    * @return: java.lang.Integer
    * @auther: Mr.Xia
    * @date: 2019/4/27 16:47
    */
    @Insert("insert into gd_vipinset(storeid , vipinsetmoney , vipinsetgetin) values(#{storeid},#{vipinsetmoney},#{vipinsetgetin})")
    Integer initVipInSet(VipInSetDTO vipInSetDTO);

    /**
    *
    * 功能描述: 
    *   根据店铺编号返回店铺会员规则信息
    * @param: [storeid] 店铺编号
    * @return: org.fresh.gd.commons.consts.pojo.dto.vip.VipInSetDTO
    * @auther: Mr.Xia
    * @date: 2019/4/27 17:00
    */
    @Select("select * from gd_vipinset where storeid = #{storeid}")
    VipInSetDTO selVipInSetById(@Param("storeid") Integer storeid);

}
