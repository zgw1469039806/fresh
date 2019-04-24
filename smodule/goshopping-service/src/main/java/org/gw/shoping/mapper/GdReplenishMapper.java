package org.gw.shoping.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.fresh.gd.commons.consts.pojo.dto.shoping.*;
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
    @Options(useGeneratedKeys=true, keyProperty="replenishId", keyColumn="replenishId")
    Integer saveGdReplen(GdReplenishDTO gdReplenishDTO);

    @Select("select * from gd_replenish g,gd_Purchase p where g.replenishId=p.replenishId")
    List<GdReplenishAndPurchaseDTO> selReAndPuAll();


    List<GdShopAllDTO> selGdShopAllByBh(ReplenishInDTO replenishInDTO);

}
