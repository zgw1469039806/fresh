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
    @Options(useGeneratedKeys = true, keyProperty = "userId", keyColumn = "userId")
    Integer saveUserYg(GdUser gdUser);

    @Select("select * from gd_user where useraccount=#{useraccount}")
    GdUser selUserAcc(@Param("useraccount") String useraccount);

    @Select("select * from gd_user where useraccount=#{useraccount}")
    UserDTO sellwxUserAcc(@Param("useraccount") String useraccount);

    List<UserDTO> selYgByMd(@Param("useraccount") String useraccount);


    @Insert("INSERT INTO gd_user(username,useraccount,password) VALUES(#{username},#{useraccount},#{password})")
    Integer wxsaveUser(GdUser gdUser);


    Integer wxupdateUser(GdUser gdUser);

    /**
     * 功能描述: 查询当前用户条数
     *
     * @param: [useraccount]
     * @return: java.lang.Integer
     * @auther: 贾轶飞
     * @date: 2019/4/26 11:27
     */
    @Select("select count(*) from gd_user where useraccount=#{useraccount}")
    Integer wxUsercount(@Param("useraccount") String useraccount);
}
