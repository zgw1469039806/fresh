package org.gd.order.fegin;

import org.fresh.gd.commons.consts.api.shoping.GDComdityParticularService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @DATA 2019/4/24 14:48
 * @Author 郭家恒
 * @Description TODO
 */
@FeignClient("goshopping-service")
public interface OrderFeginToShopping extends GDComdityParticularService {
}
