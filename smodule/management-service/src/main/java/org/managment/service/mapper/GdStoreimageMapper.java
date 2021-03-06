package org.managment.service.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.managment.service.entity.GdStoreimage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author guowei.zhang
 * @since 2019-04-17
 */
@Mapper
public interface GdStoreimageMapper extends BaseMapper<GdStoreimage> {

    @Insert("INSERT into gd_storeImage(storeid,storeImages) value(#{storeid},#{storeImages})")
    Integer saveImage(GdStoreimage gdStoreimage);

    @Delete(" delete from  gd_storeImage  where storeid=#{storeid} ")
    Integer deleteByIdStro(@Param("storeid") Integer storeid);

}
