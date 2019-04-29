package org.gd.order.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.gd.order.entity.GdShoppingcart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 购物车 Mapper 接口
 * </p>
 *
 * @author guowei.zhang
 * @since 2019-04-12
 */
@Mapper
public interface GdShoppingcartMapper extends BaseMapper<GdShoppingcart> {

    @Select("select * from gd_shoppingcart where userid=#{userid}")
    GdShoppingcart selGwcByUserId(@Param("userid")String userid);

}
