package org.gw.shoping.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdPurchaseDTO;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdReplenishDTO;
import org.gw.shoping.entity.GdPurchase;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 进货详细表 Mapper 接口
 * </p>
 *
 * @author guowei.zhang
 * @since 2019-04-22
 */
@Mapper
public interface GdPurchaseMapper extends BaseMapper<GdPurchase>
{

    Integer savePurchase(List<GdPurchaseDTO> list);
}
