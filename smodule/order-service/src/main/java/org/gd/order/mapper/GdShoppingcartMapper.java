package org.gd.order.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.gd.order.entity.GdShoppingcart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

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


    /** 功能描述:
    * 根据用户查询当前用户购物车信息
    * @param: [useraccount]用户账号
    * @return: java.util.List<org.gd.order.entity.GdShoppingcart>
    * @auther: 贾轶飞
    * @date: 2019/5/6 10:10
    */
    @Select("select * from gd_shoppingcart where useraccount = #{useraccount}")
    public List<GdShoppingcart> queryCart(@Param("useraccount")String useraccount);
}
