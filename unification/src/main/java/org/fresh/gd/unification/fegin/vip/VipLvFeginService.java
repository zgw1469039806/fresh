package org.fresh.gd.unification.fegin.vip;

import org.fresh.gd.commons.consts.api.vip.VipLvService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @Auther: 夏乾航 email:xqh151@163.com
 * @Date: 2019/4/24 17:27
 * @Description:
 */
@FeignClient("vip-service")
public interface VipLvFeginService extends VipLvService {
}
