package org.fresh.gd.unification.controller.shoping;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityDTO;
import org.fresh.gd.unification.fegin.shoping.GdCommodityFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @DATA 2019-04-21 11:30
 * @Author 张国伟  WeChat:17630376104
 * @Description 商品服务
 */
@Api(description = "商品信息")
@Slf4j
@RestController
@RequestMapping("/unification")
public class GdCommodityController {

    @Autowired
    GdCommodityFeignService gdCommodityFeignService;


    @GetMapping("/selShopAll")
    public ResponseData<List<GdCommodityDTO>> selShopAll()
    {
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
        ResponseData<List<GdCommodityDTO>> responseData = gdCommodityFeignService.selShopingAll();
        System.out.println("responseData = " + responseData);
        return responseData;
    }
}
