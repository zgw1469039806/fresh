package org.gw.shoping.impl;

import org.fresh.gd.commons.consts.api.shoping.ShopingService;
import org.fresh.gd.unification.fegin.shoping.ShopingFeginService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

/**
 * @DATA 2019-04-14 08:49
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@RestController
public class TestShoping implements ShopingService {

    @Override
    public String shop() {
        return "1234567890";
    }
}
