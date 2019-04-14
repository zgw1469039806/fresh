package org.fresh.gd.unification.fegin.shoping;

import org.fresh.gd.commons.consts.api.shoping.ShopingService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @DATA 2019-04-14 08:47
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */
@FeignClient("goshopping-service")
public interface ShopingFeginService  extends ShopingService {

}
