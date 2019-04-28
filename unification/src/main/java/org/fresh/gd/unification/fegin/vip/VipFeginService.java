package org.fresh.gd.unification.fegin.vip;

import org.fresh.gd.commons.consts.api.vip.VipService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @Auther: 夏乾航 email:xqh151@163.com
 * @Date: 2019/4/28 14:35
 * @Description:
 */
@FeignClient("vip-service")
public interface VipFeginService extends VipService {

}
