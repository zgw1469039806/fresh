package org.gd.vip.impl;

import org.fresh.gd.commons.consts.api.vip.VipService;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.user.UserAndVipDTO;
import org.fresh.gd.commons.consts.pojo.dto.vip.GdAddVipDTO;
import org.gd.vip.mapper.GdVipMapper;
import org.gd.vip.mapper.GdViplvMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 贾轶飞
 * @date 2019/4/26 13:19
 */
@RestController
public class VipServiceImpl implements VipService {
    @Autowired
    GdVipMapper gdVipMapper;

    @Override
    public ResponseData<UserAndVipDTO> selectOne(@RequestBody RequestData<UserAndVipDTO> requestData) {
        ResponseData<UserAndVipDTO> responseData=new ResponseData<>();
        responseData.setData(gdVipMapper.selevtOne(requestData.getData().getUserId()));

        return responseData;
    }
}
