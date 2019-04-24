package org.gw.shoping.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import javafx.scene.control.Pagination;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityDTO;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityListDTO;
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

    /**
     * 功能描述
     * 用户展示
     *
     * @param
     * @return java.util.List<org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityDTO>
     * @author zgw
     */
    @Select("select * from gd_commodity")
     List<GdCommodityDTO> selShopAllUser();

    /**
     * 功能描述
     * Admin管理 商品信息 带分页
     * @param page
     * @return java.util.List<org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityDTO>
     * @author zgw
     */

    List<GdCommodityDTO> selShopAllAdmin(Page<GdCommodityDTO> page, @Param("comdityname") String comdityname, @Param
            ("storeid") Integer storeid,@Param("")Integer comditytypeId);


    List<GdCommodityListDTO> selheadlineAll();

    GdCommodityListDTO selOne(@Param("comdityId") Integer comdityId);

}
