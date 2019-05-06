package org.fresh.gd.unification.controller.vip;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.vip.GdAddVipLvDTO;
import org.fresh.gd.unification.fegin.vip.VipLvFeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: 夏乾航 email:xqh151@163.com
 * @Date: 2019/4/24 17:21
 * @Description: 会员等级管理
 */

@Api(description = "会员等级管理")
@Slf4j
@RequestMapping("/vipLvController")
@RestController
public class VipLvController {

    @Autowired
    VipLvFeginService vipLvFeginService;


    @PostMapping("/addVipLv")
    public ResponseData<Integer> addVipLv(@RequestBody RequestData<GdAddVipLvDTO> requestData){
        log.info("添加会员等级-vipLvController");
        return vipLvFeginService.addVipLv(requestData);
    }

    @PostMapping("/delVipLv")
    public ResponseData<Integer> delVipLv(@RequestBody RequestData<Integer> requestData){
        log.info("删除vip等级-vipLvController");
        return vipLvFeginService.delVipLv(requestData);
    }

    @PostMapping("/updVipLv")
    public ResponseData<Integer> updVipLv(@RequestBody RequestData<GdAddVipLvDTO> requestData){
        log.info("修改vip等级-vipLvController"+requestData.getData());
        return vipLvFeginService.updVipLv(requestData);
    }

    @PostMapping("/selVipLvById")
    public ResponseData<GdAddVipLvDTO> selVipLvById(@RequestBody RequestData<Integer> requestData){
        log.info("查询一个会员等级-vipLvController");
        return vipLvFeginService.selVipLvById(requestData);
    }

    @GetMapping("/selAllVipLv")
    public ResponseData<List<GdAddVipLvDTO>> selAllVipLv(){
        log.info("查询全部-vipLvController");
        return vipLvFeginService.selAllVipLv();
    }

}
