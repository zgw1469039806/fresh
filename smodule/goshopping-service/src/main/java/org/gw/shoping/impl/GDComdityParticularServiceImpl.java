package org.gw.shoping.impl;


import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.codingapi.txlcn.tc.annotation.TxTransaction;
import org.fresh.gd.commons.consts.api.shoping.GDComdityParticularService;
import org.fresh.gd.commons.consts.exceptions.BizException;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdComdityparticularDTO;
import org.gw.shoping.entity.GdComdityparticular;
import org.gw.shoping.mapper.GdComdityparticularMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

/**
 * 商品详情实现
 * @DATA 2019/4/24 14:22
 * @Author 郭家恒
 * @Description TODO
 */
@RestController
public class GDComdityParticularServiceImpl implements GDComdityParticularService {
    @Autowired
    GdComdityparticularMapper gdComdityparticularMapper;

    /**
     * 功能描述:
     * 查询库存
     *
     * @param requestData
     * @param: [requestData]
     * @return: org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
     * @auther: 郭家恒
     * @date: 2019/4/24 14:20
     */
    @Override
    public ResponseData<List> editStock(@RequestBody RequestData<List<GdComdityparticularDTO>> requestData) {
        ResponseData<List> responseData = new ResponseData<>();
        List<Integer> comdityIds = new ArrayList<>();
        List<GdComdityparticular> errorlist = new ArrayList<>();
        for (GdComdityparticularDTO dto: requestData.getData()){
            comdityIds.add(dto.getComdityId());
        }
        List<GdComdityparticular> comdityparticulars = gdComdityparticularMapper.QueryStock(comdityIds);
        responseData.setMsg("库存充足!");
        for (GdComdityparticularDTO dto: requestData.getData()){
            for (GdComdityparticular comdityparticular:comdityparticulars){
                if (dto.getStock()>comdityparticular.getStock()){
                    errorlist.add(comdityparticular);
                    responseData.setMsg("库存不足!");
                }
            }
        }
        System.out.println(comdityparticulars);
        responseData.setData(errorlist);
        return responseData;
    }

    /**
     * 功能描述:
     * 减少库存
     *
     * @param requestData
     * @param: [requestData]
     * @return: org.fresh.gd.commons.consts.pojo.ResponseData<java.util.List>
     * @auther: 郭家恒
     * @date: 2019/4/24 17:24
     */
    @TxTransaction
    @Transactional
    @Override
    public ResponseData<Integer> reduceStock(@RequestBody RequestData<List<GdComdityparticularDTO>> requestData) {
        ResponseData<Integer> responseData = new ResponseData<>();
        List<Integer> comdityIds = new ArrayList<>();
        List<GdComdityparticular> errorlist = new ArrayList<>();
        for (GdComdityparticularDTO dto: requestData.getData()){
            gdComdityparticularMapper.reduceStock(dto.getComdityId(),dto.getStock());
        }
        responseData.setCode(1000);
        return responseData;
    }
}
