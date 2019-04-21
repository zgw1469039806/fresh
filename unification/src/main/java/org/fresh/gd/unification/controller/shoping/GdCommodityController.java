package org.fresh.gd.unification.controller.shoping;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.fresh.gd.commons.consts.exceptions.BizException;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityDTO;
import org.fresh.gd.unification.fegin.shoping.GdCommodityFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

        ResponseData<List<GdCommodityDTO>> responseData = gdCommodityFeignService.selShopingAll();

        return responseData;
    }

    @PostMapping("/selByPage")
    public ResponseData<Page<GdCommodityDTO>> selByPage(@RequestBody RequestData<GdCommodityDTO> gdCommodityDTORequestData)
    {
        if (gdCommodityDTORequestData.getData()==null)
        {
            throw new BizException("请求错误");
        }
        return gdCommodityFeignService.selPageShop(gdCommodityDTORequestData);
    }



}
