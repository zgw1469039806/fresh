package org.gd.order.impl;

import org.fresh.gd.commons.consts.api.order.GDShoppingCartService;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.order.GdOrdershopDTO;
import org.gd.order.mapper.GdShoppingcartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 贾轶飞
 * @dat e2019/5/6 10:24
 */
@RestController
public class ShoppingCartServiceImpl implements GDShoppingCartService {

    @Autowired
    private GdShoppingcartMapper gdShoppingcartMapper;



    @Override
    public ResponseData<List<GdOrdershopDTO>> queryCart(RequestData<String> useraccount) {


        return null;
    }
}
