package org.gw.shoping.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityDTO;
import org.gw.shoping.entity.GdCommodity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 商品表 Mapper 接口
 * </p>
 *
 * @author guowei.zhang
 * @since 2019-04-12
 */
@Mapper
public interface GdCommodityMapper extends BaseMapper<GdCommodity> {

    @Select("select * from gd_commodity")
    public List<GdCommodityDTO> selShopAll();

}
