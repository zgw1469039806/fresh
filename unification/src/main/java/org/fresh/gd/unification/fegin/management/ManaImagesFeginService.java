package org.fresh.gd.unification.fegin.management;

import org.fresh.gd.commons.consts.api.management.ManageImageService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @DATA 2019-04-19 11:15
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */
@FeignClient("MANAGEMENT-SERVICE")
public interface ManaImagesFeginService extends ManageImageService {
}
