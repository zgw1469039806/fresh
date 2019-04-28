package org.fresh.gd.unification.controller.shoping;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdReplenishAndPurchaseDTO;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdReplenishDTO;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdShopAllDTO;
import org.fresh.gd.commons.consts.pojo.dto.shoping.ReplenishInDTO;
import org.fresh.gd.unification.fegin.shoping.GdReplenishFeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

/**
 * @DATA 2019-04-22 11:28
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@Api(description = "进货管控")
@Slf4j
@RestController
@RequestMapping("/unification")
public class GdReplenishController {

    @Autowired
    GdReplenishFeginService  gdReplenishFeginService;

    @PostMapping("/savegdReplen")
    public ResponseData<Integer> savegdReplen(@RequestBody RequestData<GdReplenishDTO> requestData, Principal principal)
    {
           requestData.getData().setUsername(principal.getName());
           return gdReplenishFeginService.saveGdReplenish(requestData);
    }

    @PostMapping("/selReAndPuAll")
    public ResponseData<List<GdReplenishAndPurchaseDTO>> selReAndPuAll()
    {
        return gdReplenishFeginService.selReAndPuAll();
    }

    @PostMapping("/selGdShopAll")
    public ResponseData<List<GdReplenishDTO>> selGdShopAll(@RequestBody RequestData<ReplenishInDTO> replenishInDTORequestData)
    {
          return gdReplenishFeginService.selGdShopAll(replenishInDTORequestData);
    }
}
