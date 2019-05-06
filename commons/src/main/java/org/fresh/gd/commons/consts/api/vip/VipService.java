package org.fresh.gd.commons.consts.api.vip;

import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.user.UserAndVipDTO;
import org.fresh.gd.commons.consts.pojo.dto.vip.*;
import org.fresh.gd.commons.consts.utils.PageBean;
import org.springframework.web.bind.annotation.*;

/**
 * @author 贾轶飞
 * @dat e2019/4/26 13:21
 */
@RequestMapping("/VipService")
public interface VipService {
    /** 功能描述:
    *      根据会员卡号查询会员信息
    * @param: [requestData]
    * @return: org.fresh.gd.commons.consts.pojo.ResponseData<org.fresh.gd.commons.consts.pojo.dto.user.UserAndVipDTO>
    * @auther: 贾轶飞
    * @date: 2019/4/27 9:18
    */
    @PostMapping("/vipSelectOne")
    ResponseData<UserAndVipDTO> selectOne(RequestData<UserAndVipDTO> requestData);

    /**
    *
    * 功能描述:
    *   新增会员
    * @param: [dtogdAddVipDTO]
    * @return: org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
    * @auther: Mr.Xia
    * @date: 2019/4/28 13:47
    */
    @PostMapping("/addVip")
    ResponseData<Integer> addVip(RequestData<GdAddVipDTO > dtogdAddVipDTO);

    /**
    *
    * 功能描述:
    *   分页显示会员信息
    * @param: [pageVipdto]
    * @return: org.fresh.gd.commons.consts.pojo.ResponseData<org.fresh.gd.commons.consts.utils.PageBean<org.fresh.gd.commons.consts.pojo.dto.vip.VipPageDTO>>
    * @auther: Mr.Xia
    * @date: 2019/4/29 15:43
    */
    @PostMapping("/selPageListVip")
    ResponseData<PageBean<VipPageDTO>> selPageListVip(RequestData<SelPageVipDTO> pageVipdto);


    /**
    *
    * 功能描述:
    *   条件查询vip总数
    * @param: [vipName, VipLv]
    * @return: java.lang.Integer
    * @auther: Mr.Xia
    * @date: 2019/4/29 16:09
    */
    @PostMapping("/selPageCountVip")
    Integer selPageCountVip(@RequestParam("vipName") String vipName ,@RequestParam("viplv") Integer viplv);


    /**
    *
    * 功能描述:
    *   根据会员编号删除会员
    * @param: [vipId]
    * @return: java.lang.Integer
    * @auther: Mr.Xia
    * @date: 2019/5/6 8:43
    */
    @PostMapping("/delVipById")
    ResponseData<String> delVipById(RequestData<String> vipId);


    /**
    *
    * 功能描述:
    *    根据会员编号查询会员
    * @param: [vipId]
    * @return: org.fresh.gd.commons.consts.pojo.ResponseData<org.fresh.gd.commons.consts.pojo.dto.vip.VipPageDTO>
    * @auther: Mr.Xia
    * @date: 2019/5/6 9:35
    */
    @PostMapping("/selOneVipById")
    ResponseData<VipPageDTO> selOneVipById(RequestData<String> vipId);

    /**
    *
    * 功能描述:
    *   修改会员
    * @param: [vipUpdDTORequestData]
    * @return: org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
    * @auther: Mr.Xia
    * @date: 2019/5/6 10:15
    */
    @PostMapping("/updOneVip")
    ResponseData<Integer> updOneVip(RequestData<VipUpdDTO> vipUpdDTORequestData);
}
