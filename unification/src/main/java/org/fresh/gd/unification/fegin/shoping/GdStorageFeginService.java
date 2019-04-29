package org.fresh.gd.unification.fegin.shoping;

import org.fresh.gd.commons.consts.api.shoping.GdStorageService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @DATA 2019/4/29 15:54
 * @Author 郭家恒
 * @Description TODO
 */
@FeignClient("goshopping-service")
public interface GdStorageFeginService extends GdStorageService {
}
