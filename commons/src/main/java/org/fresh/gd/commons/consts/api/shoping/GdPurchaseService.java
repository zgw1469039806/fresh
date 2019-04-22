package org.fresh.gd.commons.consts.api.shoping;

import io.swagger.models.auth.In;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdReplenishDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @DATA 2019-04-22 14:47
 * @Author 张国伟  WeChat:17630376104
 * @Description 进货详细
 */
@RequestMapping("/GdPurchaseService")
public interface GdPurchaseService {


    /**
     * 功能描述
     *  添加进货管控同时添加进货详情
     * @param requestData
     * @return org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
     * @author zgw
     */
    @PostMapping("/saveGdPurchase")
    ResponseData<Integer> saveGdPurchase(RequestData<GdReplenishDTO> requestData);

}
