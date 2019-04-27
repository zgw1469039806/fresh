package org.fresh.gd.commons.consts.api.vip;

import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.vip.VipInSetDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 夏乾航 email:xqh151@163.com
 * @Date: 2019/4/27 11:49
 * @Description: 会员积分增加规则设定Service
 */
@RequestMapping("/VipInSetService")
public interface VipInSetService {

    /**
    *
    * 功能描述:
    *   根据店铺id修改积分规则
    * @param: [dtoVipInSetDTO]
    * @return: org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
    * @auther: Mr.Xia
    * @date: 2019/4/27 11:57
    */
    @PostMapping("/updGdVipInSet")
    ResponseData<Integer> updGdVipInSet(RequestData<VipInSetDTO> dtoVipInSetDTO);


    /**
    *
    * 功能描述:
    *   初始化积分规则  在创建新店铺时一并调用此方法
    * @param: [dtoVipInSetDTO]
    * @return: org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
    * @auther: Mr.Xia
    * @date: 2019/4/27 17:02
    */
    @PostMapping("/initVipInSet")
    ResponseData<Integer> initVipInSet(RequestData<VipInSetDTO> dtoVipInSetDTO);

    /**
    *
    * 功能描述:
    *       根据店铺编号返回店铺会员规则信息
    * @param: [integerRequestData] 店铺编号
    * @return: org.fresh.gd.commons.consts.pojo.ResponseData<org.fresh.gd.commons.consts.pojo.dto.vip.VipInSetDTO>
    * @auther: Mr.Xia
    * @date: 2019/4/27 17:03
    */
    @PostMapping("/selVipInSetById")
    ResponseData<VipInSetDTO> selVipInSetById(RequestData<Integer> integerRequestData);
}
