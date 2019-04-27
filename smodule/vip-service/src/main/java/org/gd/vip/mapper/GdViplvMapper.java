package org.gd.vip.mapper;

import org.apache.ibatis.annotations.*;
import org.fresh.gd.commons.consts.pojo.dto.vip.GdAddVipLvDTO;
import org.gd.vip.entity.GdViplv;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 会员等级表 Mapper 接口
 * </p>
 *
 * @author guowei.zhang
 * @since 2019-04-12
 */
@Mapper
public interface GdViplvMapper extends BaseMapper<GdViplv> {
    /**
    *
    * 功能描述:
    *    添加会员等级
    * @param: [gdAddVipLvDTO]
    * @return: java.lang.Integer
    * @auther: Mr.Xia
    * @date: 2019/4/26 16:33
    */
    @Insert("insert into gd_viplv(viplv,vipdiscount,vipintegration) values(#{viplv},#{vipdiscount},#{vipintegration})")
    Integer addVipLv(GdAddVipLvDTO gdAddVipLvDTO);

    /**
    *
    * 功能描述:
    *   删除会员等级
    * @param: [vipLv]
    * @return: java.lang.Integer
    * @auther: Mr.Xia
    * @date: 2019/4/26 16:34
    */
    @Delete("delete from gd_viplv where viplv = #{vipLv}")
    Integer delVipLv(@Param("vipLv") Integer vipLv);

    /**
    *
    * 功能描述:
    *    根据会员等级编号查询会员等级信息
    * @param: [vipLv]
    * @return: org.fresh.gd.commons.consts.pojo.dto.vip.GdAddVipLvDTO
    * @auther: Mr.Xia
    * @date: 2019/4/26 16:43
    */
    @Select("select * from gd_viplv where viplv = #{vipLv}")
    GdAddVipLvDTO selVipLvById(@Param("vipLv") Integer vipLv);

    /**
    *
    * 功能描述:
    *   根据会员编号更新会员等级
    * @param: [gdAddVipLvDTO]
    * @return: java.lang.Integer
    * @auther: Mr.Xia
    * @date: 2019/4/26 16:34
    */
    @Update("update gd_viplv set vipdiscount = #{vipdiscount} , vipintegration = #{vipintegration} where viplv = #{viplv}")
    Integer updVipLv(GdAddVipLvDTO gdAddVipLvDTO);


    /**
    *
    * 功能描述:
    *   查询全部
    * @param: []
    * @return: java.util.List<org.fresh.gd.commons.consts.pojo.dto.vip.GdAddVipLvDTO>
    * @auther: Mr.Xia
    * @date: 2019/4/27 9:13
    */
    @Select("select * from gd_viplv")
    List<GdAddVipLvDTO> selAllVipLv();

}
