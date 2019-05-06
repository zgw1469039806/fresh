package org.gw.shoping.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.gw.shoping.entity.GdComdityparticular;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.gw.shoping.entity.GdCommodity;

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

    /**
     * 功能描述:
     * 查询指定商品的库存
     *
     * @param: [list] 商品ID的集合
     * @return: java.lang.Integer
     * @auther: 郭家恒
     * @date: 2019/4/24 14:26
     */
    List<GdComdityparticular> QueryStock(List<Integer> list);

    /**
     * 功能描述:
     * 更改库存
     *
     * @param: [cid, stock, type]
     * cid: 商品ID stock:数量 type: 要做的操作(0-减少库存 1-增加库存 2-修改库存)
     * @return: java.lang.Integer
     * @auther: 郭家恒
     * @date: 2019/5/6 8:16
     */
    Integer reduceStock(@Param("cid") Integer cid, @Param("stock") Integer stock, @Param("type") Integer type);
}
