package org.gw.shoping.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import javafx.scene.control.Pagination;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdComditynameDTO;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityDTO;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityListDTO;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdinventoryallDTO;
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
     *
     * @param page
     * @return java.util.List<org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityDTO>
     * @author zgw
     */
    List<GdCommodityDTO> selShopAllAdmin(Page<GdCommodityDTO> page, @Param("comdityname") String comdityname, @Param
            ("storeid") Integer storeid, @Param("") Integer comditytypeId);

    /**
     * 功能描述:
     * 微信客户端首页活动标题及显示商品4条商品
     *
     * @param: [参数暂定]
     * @return: java.util.List<org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityListDTO>
     * @auther: 贾轶飞
     * @date: 2019/4/26 15:05
     */
    List<GdCommodityListDTO> selheadlineAll();

    /**
     * 功能描述:
     * 单个商品描述
     *
     * @param: [comdityId]商品id
     * @return: org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityListDTO
     * @auther: 贾轶飞
     * @date: 2019/4/26 15:08
     */
    GdCommodityListDTO selOne(@Param("comdityId") Integer comdityId);


    /** 功能描述:
    *客户端显示全部页面所有商品类型id查询
    * @param: [typeid]商品的类型id
    * @return: java.util.List<org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityListDTO>
    * @auther: 贾轶飞
    * @date: 2019/4/26 15:10
    */
//    List<GdCommodityListDTO> wsSelAll(@Param("typeid")String typeid);



    List<GdinventoryallDTO> nventoryallmap(GdComditynameDTO gdComditynameDTO);

}
