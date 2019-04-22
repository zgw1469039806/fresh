package org.fresh.gd.unification.fegin.shoping;

import org.fresh.gd.commons.consts.api.shoping.GdReplenishService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @DATA 2019-04-22 11:29
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */
@FeignClient("goshopping-service")
public interface GdReplenishFeginService extends GdReplenishService {
}
