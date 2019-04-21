package org.fresh.gd.unification.fegin.shoping;

import org.fresh.gd.commons.consts.api.shoping.GdComditytypeService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @DATA 2019-04-21 14:44
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@FeignClient("goshopping-service")
public interface GdComditytypeFeignService  extends GdComditytypeService {
}
