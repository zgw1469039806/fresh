package org.auth.client.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.auth.client.entity.GdPosition;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 职位表 Mapper 接口
 * </p>
 *
 * @author guowei.zhang
 * @since 2019-04-11
 */
@Mapper
public interface GdPositionMapper extends BaseMapper<GdPosition> {


    @Insert("insert into gd_position(userId,pname) values(#{userId},#{pname})")
    Integer savaPoson(GdPosition gdPosition);

}
