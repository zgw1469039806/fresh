package org.gw.shoping.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdSupplierDTO;
import org.gw.shoping.entity.GdSupplier;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.security.access.method.P;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author guowei.zhang
 * @since 2019-04-22
 */
@Mapper
public interface GdSupplierMapper extends BaseMapper<GdSupplier> {

    @Insert("insert into gd_supplier(supplierBM,supplierName)values(#{supplierBM},#{supplierName})")
    Integer saveSupplier(GdSupplierDTO gdSupplierDTO);

    @Select("select * from gd_supplier where supplierName=#{supplierName}")
    GdSupplierDTO selByName(@Param("supplierName") String supplierName);

    /** 功能描述:
    * 查询全部
    * @param: []
    * @return: org.fresh.gd.commons.consts.pojo.dto.shoping.GdSupplierDTO
    * @auther: 郭家恒
    * @date: 2019/4/28 13:50
    */

    List<GdSupplierDTO> QueryAll();
}
