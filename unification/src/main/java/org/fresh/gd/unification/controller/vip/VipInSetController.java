package org.fresh.gd.unification.controller.vip;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.fresh.gd.commons.consts.api.vip.VipInSetService;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.vip.VipInSetDTO;
import org.fresh.gd.unification.fegin.vip.VipInSetFeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 夏乾航 email:xqh151@163.com
 * @Date: 2019/4/27 15:52
 * @Description: 会员积分增加规则设定
 */

@Slf4j
@Api("会员积分增加规则设定")
@RequestMapping("/VipInSetController")
@RestController
public class VipInSetController {

    @Autowired
    VipInSetFeginService vipInSetFeginService;

    @ApiOperation(value = "修改积分规则")
    @PostMapping("/updVipInSet")
    public ResponseData<Integer> updVipInSet(@RequestBody RequestData<VipInSetDTO> vipInSetDTO){
        return vipInSetFeginService.updGdVipInSet(vipInSetDTO);
    }


    @ApiOperation(value = "店铺积分初始化")
    @PostMapping("/initVipInSet")
    public ResponseData<Integer> initVipInSet(@RequestBody RequestData<VipInSetDTO> vipInSetDTO){
        return vipInSetFeginService.initVipInSet(vipInSetDTO);
    }


    @ApiOperation(value = "根据店铺编号查看积分规则")
    @PostMapping("/selVipInSetById")
    public ResponseData<VipInSetDTO> selVipInSetById(@RequestBody RequestData<Integer> storeid){
        return vipInSetFeginService.selVipInSetById(storeid);
    }



}
