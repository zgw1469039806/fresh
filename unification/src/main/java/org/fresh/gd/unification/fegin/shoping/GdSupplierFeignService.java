package org.fresh.gd.unification.fegin.shoping;

import org.fresh.gd.commons.consts.api.shoping.GdSupplierService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @DATA 2019-04-22 10:41
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */
@FeignClient("goshopping-service")
public interface GdSupplierFeignService extends GdSupplierService {
}
