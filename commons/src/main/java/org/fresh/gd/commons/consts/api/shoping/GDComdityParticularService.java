package org.fresh.gd.commons.consts.api.shoping;

import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdComdityparticularDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @DATA 2019/4/24 14:18
 * @Author 郭家恒
 * @Description TODO
 */
@RequestMapping("/GDComdityParticular")
public interface GDComdityParticularService {
    /** 功能描述:
    * 查询库存
    * @param: [requestData]
    * @return: org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
    * @auther: 郭家恒
    * @date: 2019/4/24 14:20
    */
    @PostMapping("/editStock")
    ResponseData<List> editStock(RequestData<List<GdComdityparticularDTO>> requestData);

    /** 功能描述:
    * 减少库存
    * @param: [requestData]
    * @return: org.fresh.gd.commons.consts.pojo.ResponseData<java.util.List>
    * @auther: 郭家恒
    * @date: 2019/4/24 17:24
    */
    @PostMapping("/reduceStock")
    ResponseData<Integer> reduceStock(RequestData<List<GdComdityparticularDTO>> requestData);
}
