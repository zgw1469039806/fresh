package org.fresh.gd.unification.controller.vip;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.vip.GdAddVipDTO;
import org.fresh.gd.unification.fegin.vip.VipFeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: 夏乾航 email:xqh151@163.com
 * @Date: 2019/4/28 14:28
 * @Description:
 */
@Api(description = "会员接口")
@RestController
@RequestMapping("/VipController")
@Slf4j
public class VipController {

    @Autowired
    VipFeginService vipFeginService;

    @ApiOperation(value = "新增会员")
    @PostMapping("/addVip")
    public ResponseData<Integer> addVip(@RequestBody RequestData<GdAddVipDTO> gdaddVipDTO){
        return vipFeginService.addVip(gdaddVipDTO);
    }

}
