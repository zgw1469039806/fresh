package org.gd.vip.mapper;

import org.apache.ibatis.annotations.*;
import org.fresh.gd.commons.consts.pojo.dto.user.UserAndVipDTO;
import org.fresh.gd.commons.consts.pojo.dto.vip.SelPageVipDTO;
import org.fresh.gd.commons.consts.pojo.dto.vip.VipPageCountDTO;
import org.fresh.gd.commons.consts.pojo.dto.vip.VipPageDTO;
import org.fresh.gd.commons.consts.pojo.dto.vip.VipUpdDTO;
import org.gd.vip.entity.GdVip;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.gd.vip.entity.GdViplv;

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
     * 功能描述:
     * 分页显示会员信息
     *
     * @param: [selPageVipDTO]
     * @return: java.util.List<org.gd.vip.entity.GdVip>
     * @auther: Mr.Xia
     * @date: 2019/4/29 15:07
     */
    List<VipPageDTO> selPageListVip(SelPageVipDTO selPageVipDTO);

    /**
     * 功能描述:
     * 条件查询vip总数
     *
     * @param: [vipPageCountDTO]
     * @return: java.lang.Integer
     * @auther: Mr.Xia
     * @date: 2019/4/29 16:01
     */
    Integer selPageCountVip(@Param("vipName") String vipName, @Param("viplv") Integer viplv);


    /**
     * 功能描述:
     * 根据会员编号删除会员
     *
     * @param: [vipId]
     * @return: java.lang.Integer
     * @auther: Mr.Xia
     * @date: 2019/5/6 8:42
     */
    @Delete("delete from gd_vip where vipId = #{vipId}")
    Integer delVipById(String vipId);


    /**
     * 功能描述:
     * 根据会员编号查询会员信息
     *
     * @param: [vipId]
     * @return: org.fresh.gd.commons.consts.pojo.dto.vip.VipPageDTO
     * @auther: Mr.Xia
     * @date: 2019/5/6 9:17
     */
    @Select("select * from gd_vip where vipId = #{vipId}")
    VipPageDTO selOneVipById(String vipId);


    /**
     * 功能描述:
     * 修改会员
     *
     * @param: [vipUpdDTO]
     * @return: java.lang.Integer
     * @auther: Mr.Xia
     * @date: 2019/5/6 10:13
     */
    @Update("update gd_vip set viplv = #{viplv} , vipintegral = #{vipintegral} , vipbalance = #{vipbalance} , vipreport = #{vipreport} where vipId = #{vipId}")
    Integer updOneVip(VipUpdDTO vipUpdDTO);



}
