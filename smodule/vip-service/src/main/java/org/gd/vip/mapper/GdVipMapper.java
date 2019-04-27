package org.gd.vip.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fresh.gd.commons.consts.pojo.dto.user.UserAndVipDTO;
import org.fresh.gd.commons.consts.pojo.dto.vip.GdAddVipDTO;
import org.gd.vip.entity.GdVip;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

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

}
