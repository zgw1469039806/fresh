package org.gd.vip.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.fresh.gd.commons.consts.pojo.dto.vip.GdAddVipLvDTO;
import org.gd.vip.entity.GdViplv;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

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

    @Insert("insert into gd_viplv(viplv,vipdiscount,vipintegration) values(#{viplv},#{vipdiscount},#{vipintegration})")
    Integer addVipLv(GdAddVipLvDTO gdAddVipLvDTO);

}
