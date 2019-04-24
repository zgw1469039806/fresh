package org.fresh.gd.unification.controller.vip;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdSupplierDTO;
import org.fresh.gd.commons.consts.pojo.dto.vip.GdAddVipLvDTO;
import org.fresh.gd.unification.fegin.vip.VipLvFeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 夏乾航 email:xqh151@163.com
 * @Date: 2019/4/24 17:21
 * @Description: 会员等级管理
 */

@Api(description = "会员等级管理")
@Slf4j
@RestController
@RequestMapping("/VipLvController")
public class VipLvController {

    @Autowired
    VipLvFeginService vipLvFeginService;

    public ResponseData<Integer> addVipLv(@RequestBody RequestData<GdAddVipLvDTO> requestData){
        return vipLvFeginService.addVipLv(requestData);
    }


}
