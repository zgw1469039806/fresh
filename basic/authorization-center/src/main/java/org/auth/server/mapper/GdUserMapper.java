package org.auth.server.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.auth.server.entity.GdUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.fresh.gd.commons.consts.pojo.dto.user.RoleAndUserDTO;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author guowei.zhang
 * @since 2019-04-11
 */
@Mapper
public interface GdUserMapper extends BaseMapper<GdUser> {

    @Select("select * from gd_user g,gd_role r,gd_position p where g.userId=p.userId and p.roleid=r.roleid and g.useraccount=#{useraccount}")
   public RoleAndUserDTO selUserAndRole(@Param("useraccount") String useraccount);

}
