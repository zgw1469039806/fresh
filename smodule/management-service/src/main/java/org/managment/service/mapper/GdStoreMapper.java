package org.managment.service.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.fresh.gd.commons.consts.pojo.dto.management.ManageStoreDTO;
import org.managment.service.entity.GdStore;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 店铺表 Mapper 接口
 * </p>
 *
 * @author guowei.zhang
 * @since 2019-04-12
 */
@Mapper
public interface GdStoreMapper extends BaseMapper<GdStore> {

    @Insert("inster into gd_store value(?,?)")
    Integer save(GdStore gdStore);

    @Select("select storeid,storename,storeaddress from gd_store where storename=#{storename}")
    ManageStoreDTO selByName(String storename);

}
