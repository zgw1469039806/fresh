package org.fresh.gd.unification.controller.shoping;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdSupplierDTO;
import org.fresh.gd.unification.fegin.shoping.GdCommodityFeignService;
import org.fresh.gd.unification.fegin.shoping.GdSupplierFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @DATA 2019-04-22 10:40
 * @Author 张国伟  WeChat:17630376104
 * @Description 供应商
 */
@Api(description = "供应商信息")
@Slf4j
@RestController
@RequestMapping("/unification")
public class GdSupplierController {

    @Autowired
    GdSupplierFeignService gdSupplierFeignService;

    @PostMapping("/integerResponseData")
    public ResponseData<Integer> integerResponseData(@RequestBody RequestData<GdSupplierDTO> requestData)
    {
        return gdSupplierFeignService.saveSupplier(requestData);
    }

    @PostMapping("/QueryAll")
    public ResponseData<List<GdSupplierDTO>> QueryAll()
    {
        return gdSupplierFeignService.QuerySypplier();
    }
}
