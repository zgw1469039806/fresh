package org.gw.shoping.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.fresh.gd.commons.consts.pojo.dto.management.GdStoreDTO;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdStorageDTO;
import org.gw.shoping.entity.GdStorage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 入库表 Mapper 接口
 * </p>
 *
 * @author guowei.zhang
 * @since 2019-04-12
 */
@Mapper
public interface GdStorageMapper extends BaseMapper<GdStorage> {

    /**
     * 功能描述:
     * 添加一条入库
     *
     * @param: [gdStoreDTO]
     * @return: java.lang.Integer
     * @auther: 郭家恒
     * @date: 2019/4/29 15:10
     */
    Integer saveStorage(GdStorageDTO gdStoreDTO);
}
