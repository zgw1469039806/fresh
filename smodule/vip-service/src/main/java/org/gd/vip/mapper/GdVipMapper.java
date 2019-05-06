package org.gd.vip.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fresh.gd.commons.consts.pojo.dto.user.UserAndVipDTO;
import org.fresh.gd.commons.consts.pojo.dto.vip.SelPageVipDTO;
import org.fresh.gd.commons.consts.pojo.dto.vip.VipPageCountDTO;
import org.fresh.gd.commons.consts.pojo.dto.vip.VipPageDTO;
import org.gd.vip.entity.GdVip;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 会员表 Mapper 接口
 * </p>
 *
 * @author guowei.zhang
 * @since 2019-04-12
 */
@Mapper
public interface GdVipMapper extends BaseMapper<GdVip> {

    @Select("select * from gd_vip where userId = #{userId}")
    UserAndVipDTO selevtOne(@Param("userId") Integer userid);

    @Insert("insert into gd_vip(vipId,userId,vipName,viplv,vipintegral,vipbalance,vipStartTime,vipreport,vipeportTime,vipphone) values(#{vipId},#{userId},#{vipName},#{viplv},#{vipintegral},#{vipbalance},#{vipStartTime},#{vipreport},#{vipeportTime},#{vipphone})")
    Integer addVip(GdVip gdVip);

    /**
    *
    * 功能描述:
    *   分页显示会员信息
    * @param: [selPageVipDTO]
    * @return: java.util.List<org.gd.vip.entity.GdVip>
    * @auther: Mr.Xia
    * @date: 2019/4/29 15:07
    */
    List<VipPageDTO> selPageListVip(SelPageVipDTO selPageVipDTO);

    /**
    *
    * 功能描述:
    *   条件查询vip总数
    * @param: [vipPageCountDTO]
    * @return: java.lang.Integer
    * @auther: Mr.Xia
    * @date: 2019/4/29 16:01
    */
    Integer selPageCountVip(@Param("vipName") String vipName , @Param("viplv") Integer viplv);








}
