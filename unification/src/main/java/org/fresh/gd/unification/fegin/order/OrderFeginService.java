package org.fresh.gd.unification.fegin.order;

import org.fresh.gd.commons.consts.api.order.GDOrderService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @DATA 2019/4/24 14:55
 * @Author 郭家恒
 * @Description TODO
 */
@FeignClient("order-service")
public interface OrderFeginService extends GDOrderService {
}
