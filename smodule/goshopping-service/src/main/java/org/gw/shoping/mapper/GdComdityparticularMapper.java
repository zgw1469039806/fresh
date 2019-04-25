package org.gw.shoping.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.gw.shoping.entity.GdComdityparticular;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 商品详细表 Mapper 接口
 * </p>
 *
 * @author guowei.zhang
 * @since 2019-04-12
 */
@Mapper
public interface GdComdityparticularMapper extends BaseMapper<GdComdityparticular> {

    /** 功能描述:
    * 查询指定商品的库存
    * @param: [list] 商品ID的集合
    * @return: java.lang.Integer
    * @auther: 郭家恒
    * @date: 2019/4/24 14:26
    */
    List<GdComdityparticular> QueryStock(List<Integer> list);

    /** 功能描述:
    * 减少库存
    * @param: [list]
    * @return: java.lang.Integer
    * @auther: 郭家恒
    * @date: 2019/4/24 17:26
    */
    Integer reduceStock(@Param("cid") Integer cid, @Param("stock") Integer stock);
}
