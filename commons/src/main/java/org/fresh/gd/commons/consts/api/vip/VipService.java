package org.fresh.gd.commons.consts.api.vip;

import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.user.UserAndVipDTO;
import org.fresh.gd.commons.consts.pojo.dto.vip.GdAddVipDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 贾轶飞
 * @dat e2019/4/26 13:21
 */
@RequestMapping("/VipService")
public interface VipService {
    /** 功能描述:
    *通过
    * @param: [requestData]
    * @return: org.fresh.gd.commons.consts.pojo.ResponseData<org.fresh.gd.commons.consts.pojo.dto.user.UserAndVipDTO>
    * @auther: 贾轶飞
    * @date: 2019/4/27 9:18
    */
    @PostMapping("/vipSelectOne")
    ResponseData<UserAndVipDTO> selectOne(RequestData<UserAndVipDTO> requestData);
}
