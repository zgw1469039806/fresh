package org.gd.order.impl;

import org.fresh.gd.commons.consts.api.order.GDOrderService;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.order.GdOrderDTO;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdComdityparticularDTO;
import org.gd.order.entity.GdOrder;
import org.gd.order.fegin.OrderFeginToShopping;
import org.gd.order.mapper.GdOrderMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @DATA 2019/4/24 13:56
 * @Author 郭家恒
 * @Description TODO
 */
@RestController
public class OrderServiceImpl implements GDOrderService {

    @Autowired
    private GdOrderMapper gdOrderMapper;

    @Autowired
    private OrderFeginToShopping orderFeginToShopping;
    /**
     * 功能描述:
     *
     * @param gdOrderDTORequestData
     * @param: [gdOrderDTO]
     * @return: org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
     * @auther: 郭家恒
     * @date: 2019/4/24 13:53
     */
    @Override
    public ResponseData<List> insertOrder(@RequestBody RequestData<GdOrderDTO> gdOrderDTORequestData) {
        RequestData<List<GdComdityparticularDTO>> requestData = new RequestData<>();
        requestData.setData(gdOrderDTORequestData.getData().getComdityparticularDTOS());
        ResponseData<List> responseData = orderFeginToShopping.editStock(requestData);
        if (responseData.getMsg().equals("库存不足")){
            return responseData;
        }else{
            GdOrder gdOrder = new GdOrder();
            BeanUtils.copyProperties(gdOrderDTORequestData.getData(),gdOrder);
            int save = gdOrderMapper.insertOrder(gdOrder);
            if (save>0){
                System.out.println("自增id为："+gdOrder.getOrderid());
                requestData.getData().get(0).setComdityId(gdOrder.getOrderid());
               ResponseData responseData1 = orderFeginToShopping.reduceStock(requestData);
            }
        }
        return responseData;
    }
}
