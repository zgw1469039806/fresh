package org.gd.vip.impl;

import org.fresh.gd.commons.consts.api.vip.VipLvService;
import org.fresh.gd.commons.consts.consts.Consts;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.vip.GdAddVipLvDTO;
import org.gd.vip.mapper.GdViplvMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 夏乾航 email:xqh151@163.com
 * @Date: 2019/4/24 16:55
 * @Description:
 */
@RestController
public class VipLvServiceImpl implements VipLvService {

    @Autowired
    private GdViplvMapper gdViplvMapper;

    @Override
    public ResponseData<Integer> addVipLv(@RequestBody RequestData<GdAddVipLvDTO> dtoRequestData) {
        ResponseData<Integer> responseData = new ResponseData<>();
        GdAddVipLvDTO gdAddVipLvDTO = dtoRequestData.getData();
        Integer i = gdViplvMapper.addVipLv(gdAddVipLvDTO);
        if(i>0){
            return responseData;
        }
        responseData.setCode(Consts.Result.BIZ_ERROR.getCode());
        return responseData;
    }
}
