package org.fresh.gd.commons.consts.api.shoping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @DATA 2019-04-14 08:58
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@RequestMapping("/shop")
public interface ShopingService {

    @GetMapping("/shop")
    public String shop();

}
