package org.fresh.gd.unification.controller.vip;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.fresh.gd.commons.consts.exceptions.BizException;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.vip.GdAddVipDTO;
import org.fresh.gd.commons.consts.pojo.dto.vip.SelPageVipDTO;
import org.fresh.gd.commons.consts.pojo.dto.vip.VipPageDTO;
import org.fresh.gd.commons.consts.pojo.dto.vip.VipUpdDTO;
import org.fresh.gd.commons.consts.utils.PageBean;
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
        log.info("进入新增会员-controller");
        return vipFeginService.addVip(gdaddVipDTO);
    }

    @ApiOperation(value = "会员分页")
    @PostMapping("/selPageListVip")
    public ResponseData<PageBean<VipPageDTO>> selPageListVip(@RequestBody RequestData<SelPageVipDTO> pageVipdto){
        return vipFeginService.selPageListVip(pageVipdto);
    }


    @ApiOperation(value = "删除会员")
    @PostMapping("/delVipById")
    public ResponseData<String> delVipById(@RequestBody RequestData<String> vipId){
        log.info("删除会员-controller" + vipId.getData());
        System.out.println("进入"+vipId);
        if(StringUtils.isEmpty(vipId.getData())){
            throw new BizException("参数不正确！");
        }
        return vipFeginService.delVipById(vipId);
    }

    @ApiOperation(value = "根据会员编号查询会员")
    @PostMapping("/selOneVipById")
    public ResponseData<VipPageDTO> selOneVipById(@RequestBody RequestData<String> vipId){
        System.out.println("进入查询"+vipId);
        if(StringUtils.isEmpty(vipId.getData())){
             throw new BizException("参数不正确！");
        }
        return vipFeginService.selOneVipById(vipId);
    }

    @ApiOperation(value = "根据会员编号修改会员")
    @PostMapping("/updOneVip")
    public ResponseData<Integer> updOneVip(@RequestBody RequestData<VipUpdDTO> vipUpdDTO){
        log.info("进入VipController - 修改会员");
        return vipFeginService.updOneVip(vipUpdDTO);
    }

}
