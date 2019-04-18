package org.fresh.gd.unification.fegin.management;

import org.fresh.gd.commons.consts.api.management.ManageService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @DATA 2019-04-17 15:13
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@FeignClient("management-service")
public interface ManaFeginService  extends ManageService{


}
