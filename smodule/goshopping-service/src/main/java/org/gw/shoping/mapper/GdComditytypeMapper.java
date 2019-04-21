package org.gw.shoping.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdComditytypeDTO;
import org.gw.shoping.entity.GdComditytype;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 商品类型表 Mapper 接口
 * </p>
 *
 * @author guowei.zhang
 * @since 2019-04-12
 */
@Mapper
public interface GdComditytypeMapper extends BaseMapper<GdComditytype> {


    @Select("select * from gd_comditytype")
    List<GdComditytypeDTO> selTypeAll();

    @Insert("insert into gd_comditytype(typename,parent) value(#{typename},#{parent})")
    Integer savaType(GdComditytypeDTO GdComditytypeDTO);

}
