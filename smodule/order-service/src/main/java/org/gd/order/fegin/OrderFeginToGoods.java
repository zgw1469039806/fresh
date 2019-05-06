package org.gd.order.fegin;

import org.fresh.gd.commons.consts.api.shoping.GDComdityParticularService;
import org.fresh.gd.commons.consts.api.shoping.GdCommodityService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author 贾轶飞
 * @dat e2019/5/6 11:44
 */
@FeignClient("goshopping-service")
public interface OrderFeginToGoods extends GdCommodityService {
}
