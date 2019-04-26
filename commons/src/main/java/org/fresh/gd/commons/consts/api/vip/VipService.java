package org.fresh.gd.commons.consts.api.vip;

import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.vip.GdAddVipDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 贾轶飞
 * @dat e2019/4/26 13:21
 */
@RequestMapping("/VipService")
public interface VipService {
    @GetMapping("/vipSelectOne")
    ResponseData<GdAddVipDTO> selectOne(Integer userid);
}
