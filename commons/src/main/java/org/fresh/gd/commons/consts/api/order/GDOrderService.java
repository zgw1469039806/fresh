package org.fresh.gd.commons.consts.api.order;

import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.order.GdOrderDTO;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityDTO;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityListDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @DATA 2019/4/24 13:44
 * @Author 郭家恒
 * @Description TODO
 */
@RequestMapping("/OrderService")
public interface GDOrderService {

    /**
     * 功能描述:
     *
     * @param: [gdOrderDTO]
     * @return: org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
     * @auther: 郭家恒
     * @date: 2019/4/24 13:53
     */
    @PostMapping("/insertOrder")
    ResponseData<List> insertOrder(RequestData<GdOrderDTO> gdOrderDTORequestData);


    /** 功能描述:
    *根据用户id信息 查询购物车商品
    * @param: [requestData]
    * @return: org.fresh.gd.commons.consts.pojo.ResponseData<java.util.List<org.fresh.gd.commons.consts.pojo.ResponseData<org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityListDTO>>>
    * @auther: 贾轶飞
    * @date: 2019/5/7 13:55
    */
    @PostMapping("/selGwcByShopId")
    ResponseData<List<ResponseData<GdCommodityListDTO>>> selGwcByShopId(String requestData);
}
