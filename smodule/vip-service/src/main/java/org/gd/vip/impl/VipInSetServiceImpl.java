package org.gd.vip.impl;

import org.fresh.gd.commons.consts.api.vip.VipInSetService;
import org.fresh.gd.commons.consts.consts.Consts;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.vip.VipInSetDTO;
import org.gd.vip.mapper.GdVipInSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 夏乾航 email:xqh151@163.com
 * @Date: 2019/4/27 11:56
 * @Description: 会员积分增加规则设定
 */
@RestController
public class VipInSetServiceImpl implements VipInSetService {

    @Autowired
    GdVipInSetMapper gdVipInSetMapper;

    /**
     * 功能描述:
     * 根据店铺id修改积分规则
     *
     * @param: [dtoVipInSetDTO]
     * @return: org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
     * @auther: Mr.Xia
     * @date: 2019/4/27 11:57
     */
    @Override
    public ResponseData<Integer> updGdVipInSet(@RequestBody RequestData<VipInSetDTO> dtoVipInSetDTO){
        ResponseData<Integer> responseData = new ResponseData<>();
        VipInSetDTO vip = dtoVipInSetDTO.getData();
        Integer i = gdVipInSetMapper.updGdVipInSet(vip);
        if(i > 0){
            return responseData;
        }
        responseData.setCode(Consts.Result.BIZ_ERROR.getCode());
        responseData.setMsg(Consts.Result.BIZ_ERROR.getMsg());
        return responseData;
    }

    /**
     * 功能描述:
     * 初始化积分规则  在创建新店铺时一并调用此方法
     *
     * @param dtoVipInSetDTO
     * @param: [dtoVipInSetDTO]
     * @return: org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
     * @auther: Mr.Xia
     * @date: 2019/4/27 17:02
     */
    @Override
    public ResponseData<Integer> initVipInSet(@RequestBody RequestData<VipInSetDTO> dtoVipInSetDTO) {
        ResponseData<Integer> responseData = new ResponseData<>();
        Integer i = gdVipInSetMapper.initVipInSet(dtoVipInSetDTO.getData());
        if(i > 0){
            return responseData;
        }
        responseData.setCode(Consts.Result.BIZ_ERROR.getCode());
        return null;
    }

    /**
     * 功能描述:
     * 根据店铺编号返回店铺会员规则信息
     *
     * @param integerRequestData
     * @param: [integerRequestData] 店铺编号
     * @return: org.fresh.gd.commons.consts.pojo.ResponseData<org.fresh.gd.commons.consts.pojo.dto.vip.VipInSetDTO>
     * @auther: Mr.Xia
     * @date: 2019/4/27 17:03
     */
    @Override
    public ResponseData<VipInSetDTO> selVipInSetById(@RequestBody RequestData<Integer> integerRequestData) {
        ResponseData<VipInSetDTO> responseData = new ResponseData<>();
        VipInSetDTO vipInSetDTO = gdVipInSetMapper.selVipInSetById(integerRequestData.getData());
        if(vipInSetDTO != null){
            responseData.setData(vipInSetDTO);
            return responseData;
        }
        responseData.setCode(Consts.Result.BIZ_ERROR.getCode());
        return responseData;
    }
}
