package org.auth.client.mapper;

import org.apache.ibatis.annotations.*;
import org.auth.client.entity.GdUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.fresh.gd.commons.consts.pojo.dto.oauth.UserDTO;

import java.util.List;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author guowei.zhang
 * @since 2019-04-19
 */
@Mapper
public interface GdUserMapper extends BaseMapper<GdUser> {

    @Insert("INSERT INTO gd_user(username,useraccount,password,phone,isnoVip,isnoYg,takedelivery) VALUES(#{username},#{useraccount},#{password},#{phone},#{isnoVip},#{isnoYg},#{takedelivery})")
    @Options(useGeneratedKeys=true, keyProperty="userId", keyColumn="userId")
    Integer saveUserYg(GdUser gdUser);

    @Select("select * from gd_user where useraccount=#{useraccount}")
    GdUser selUserAcc(@Param("useraccount") String useraccount);

    List<UserDTO> selYgByMd(@Param("username") String username);
}
