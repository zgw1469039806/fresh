package org.fresh.gd.unification.fegin.vip;

import org.fresh.gd.commons.consts.api.vip.VipInSetService;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.vip.VipInSetDTO;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @Auther: 夏乾航 email:xqh151@163.com
 * @Date: 2019/4/27 16:08
 * @Description:
 */
@FeignClient("vip-service")
public interface VipInSetFeginService extends VipInSetService {

}
