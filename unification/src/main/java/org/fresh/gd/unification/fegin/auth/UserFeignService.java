package org.fresh.gd.unification.fegin.auth;

import org.fresh.gd.commons.consts.api.auth.UserService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @DATA 2019-04-19 14:29
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@FeignClient("authorization-service")
public interface UserFeignService extends UserService {
}
