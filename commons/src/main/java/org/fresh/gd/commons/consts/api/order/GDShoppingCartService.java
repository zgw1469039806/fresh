package org.fresh.gd.commons.consts.api.order;

import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.order.GdOrdershopDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 贾轶飞
 * @dat e2019/5/6 10:13
 */
@RequestMapping("/ShoppingCartService")
public interface GDShoppingCartService {


    /** 功能描述:
    *  根据用户查询当前用户购物车信息
    * @param: [useraccount] 用户账号
    * @return: org.fresh.gd.commons.consts.pojo.ResponseData<java.util.List<org.fresh.gd.commons.consts.pojo.dto.order.GdOrdershopDTO>>
    * @auther: 贾轶飞
    * @date: 2019/5/6 10:16
    */
    @PostMapping("/queryCart")
    public ResponseData<List<GdOrdershopDTO>> queryCart(RequestData<String> useraccount);
}
