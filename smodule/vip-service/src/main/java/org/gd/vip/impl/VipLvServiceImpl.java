package org.gd.vip.impl;

import io.swagger.annotations.ApiModelProperty;
import org.fresh.gd.commons.consts.api.vip.VipLvService;
import org.fresh.gd.commons.consts.consts.Consts;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.vip.GdAddVipLvDTO;
import org.gd.vip.mapper.GdViplvMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Auther: 夏乾航 email:xqh151@163.com
 * @Date: 2019/4/24 16:55
 * @Description:
 */
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
