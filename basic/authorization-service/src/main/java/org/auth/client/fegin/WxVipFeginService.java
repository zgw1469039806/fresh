package org.auth.client.fegin;

import org.fresh.gd.commons.consts.api.vip.VipService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author 贾轶飞
 * @dat e2019/4/27 8:30
 */
@FeignClient("vip-service")
public interface WxVipFeginService extends VipService {
}
