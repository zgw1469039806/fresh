package org.fresh.gd.commons.consts.api.vip;

import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.vip.GdAddVipLvDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Auther: 夏乾航 email:xqh151@163.com
 * @Date: 2019/4/24 16:33
 * @Description: 会员等级管理Service
 */

@RequestMapping("/VipLvService")
public interface VipLvService {

    /**
    *
    * 功能描述:
    *   添加vip等级
    * @param: [dtoRequestData]
    * @return: org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
    * @auther: Mr.Xia
    * @date: 2019/4/24 16:53
    */
    @PostMapping("/addVipLv")
    ResponseData<Integer> addVipLv(RequestData<GdAddVipLvDTO> dtoRequestData);

    /**
    *
    * 功能描述:
    *   删除vip等级
    * @param: [requestData]
    * @return: org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
    * @auther: Mr.Xia
    * @date: 2019/4/27 9:21
    */
    @PostMapping("/delVipLv")
    ResponseData<Integer> delVipLv(RequestData<Integer> requestData);

    /**
    *
    * 功能描述:
    *   修改vip等级
    * @param: [dtoRequestData]
    * @return: org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
    * @auther: Mr.Xia
    * @date: 2019/4/27 9:22
    */
    @PostMapping("/updVipLv")
    ResponseData<Integer> updVipLv(RequestData<GdAddVipLvDTO> dtoRequestData);

    @PostMapping("/selVipLvById")
    ResponseData<GdAddVipLvDTO> selVipLvById(RequestData<Integer> requestData);

    /**
    *
    * 功能描述:
    * 查询全部
    * @param: []
    * @return: org.fresh.gd.commons.consts.pojo.ResponseData<java.util.List<org.fresh.gd.commons.consts.pojo.dto.vip.GdAddVipLvDTO>>
    * @auther: Mr.Xia
    * @date: 2019/4/27 9:17
    */
    @GetMapping("/selAllVipLv")
    ResponseData<List<GdAddVipLvDTO>> selAllVipLv();

}
