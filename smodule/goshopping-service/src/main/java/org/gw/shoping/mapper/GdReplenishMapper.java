package org.gw.shoping.mapper;

import org.apache.ibatis.annotations.*;
import org.fresh.gd.commons.consts.pojo.dto.shoping.*;
import org.gw.shoping.entity.GdPurchase;
import org.gw.shoping.entity.GdReplenish;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 商品进货表 Mapper 接口
 * </p>
 *
 * @author guowei.zhang
 * @since 2019-04-12
 */
@Mapper
public interface GdReplenishMapper extends BaseMapper<GdReplenish> {

    @Insert("INSERT INTO gd_replenish(replenishTime,username,storeid,supplierID,isnostorage,receiptNo)VALUES(#{replenishTime},#{username},#{storeid},#{supplierID},#{isnostorage},#{receiptNo})")
    @Options(useGeneratedKeys = true, keyProperty = "replenishId", keyColumn = "replenishId")
    Integer saveGdReplen(GdReplenishDTO gdReplenishDTO);

    @Select("select * from gd_replenish g,gd_Purchase p where g.replenishId=p.replenishId")
    List<GdReplenishAndPurchaseDTO> selReAndPuAll();

    /**
     * 功能描述:
     * 查询进货表
     *
     * @param: [replenishInDTO]
     * @return: java.util.List<org.fresh.gd.commons.consts.pojo.dto.shoping.GdShopAllDTO>
     * @auther: 郭家恒
     * @date: 2019/4/27 11:31
     */
    List<GdReplenishDTO> selGdShopAllByBh(ReplenishInDTO replenishInDTO);

    /**
     * 功能描述:
     * 根据订单ID去查询订单详细
     *
     * @param: [list]
     * @return: java.util.List<org.gw.shoping.entity.GdPurchase>
     * @auther: 郭家恒
     * @date: 2019/4/27 11:33
     */
    List<GdPurchaseDTO> QueryPurByreId(@Param("reid") Integer reid);

    /**
     * 功能描述:
     * 根据单号修改商品
     *
     * @param: []
     * @return: java.util.List<java.lang.Integer>
     * @auther: 郭家恒
     * @date: 2019/4/29 15:29
     */
    List<Integer> updPurById(@Param("receiptNo") String rno);
}
