package org.gd.order.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.fresh.gd.commons.consts.pojo.dto.order.GdOrdershopDTO;
import org.gd.order.entity.GdOrdershop;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 订单详细表 Mapper 接口
 * </p>
 *
 * @author guowei.zhang
 * @since 2019-04-12
 */
@Mapper
public interface GdOrdershopMapper extends BaseMapper<GdOrdershop> {
    /**
     * 功能描述:
     * 插入订单详细
     *
     * @param: []
     * @return: int
     * @auther: 郭家恒
     * @date: 2019/4/25 16:08
     */
    int insertOrderShop(@Param("oid") Integer oid, @Param("cid") Integer cid, @Param("num") Integer num);
}
