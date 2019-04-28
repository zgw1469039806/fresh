package org.gd.vip.impl;

import org.fresh.gd.commons.consts.api.vip.VipLvService;
import org.fresh.gd.commons.consts.consts.Consts;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.vip.GdAddVipLvDTO;
import org.gd.vip.mapper.GdViplvMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
        if (i > 0) {
            return responseData;
        }
        responseData.setCode(Consts.Result.BIZ_ERROR.getCode());
        return responseData;
    }

    @Override
    public ResponseData<Integer> delVipLv(@RequestBody RequestData<Integer> requestData) {
        ResponseData<Integer> responseData = new ResponseData<>();
        System.out.println(requestData);
        if (requestData.getData() != null) {
            Integer i = gdViplvMapper.delVipLv(requestData.getData());
            if (i > 0) {
                return responseData;
            }
        }
        responseData.setMsg(Consts.Result.BIZ_ERROR.getMsg());
        responseData.setCode(Consts.Result.BIZ_ERROR.getCode());
        return responseData;
    }

    @Override
    public ResponseData<Integer> updVipLv(@RequestBody RequestData<GdAddVipLvDTO> dtoRequestData) {
        ResponseData<Integer> responseData = new ResponseData<>();
        Integer i = gdViplvMapper.updVipLv(dtoRequestData.getData());
        if (i > 0) {
            return responseData;
        }

        responseData.setMsg(Consts.Result.BIZ_ERROR.getMsg());
        responseData.setCode(Consts.Result.BIZ_ERROR.getCode());
        return responseData;
    }

    @Override
    public ResponseData<GdAddVipLvDTO> selVipLvById(@RequestBody RequestData<Integer> requestData) {
        ResponseData<GdAddVipLvDTO> responseData = new ResponseData<>();
        GdAddVipLvDTO gdAddVipLvDTO = gdViplvMapper.selVipLvById(requestData.getData());
        responseData.setData(gdAddVipLvDTO);
        return responseData;
    }


    @Override
    public ResponseData<List<GdAddVipLvDTO>> selAllVipLv() {
        ResponseData<List<GdAddVipLvDTO>> responseData = new ResponseData<>();
        responseData.setData(gdViplvMapper.selAllVipLv());
        return responseData;
    }


}
