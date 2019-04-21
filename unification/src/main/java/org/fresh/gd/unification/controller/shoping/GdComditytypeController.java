package org.fresh.gd.unification.controller.shoping;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.fresh.gd.commons.consts.consts.Consts;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdComditytypeDTO;
import org.fresh.gd.unification.fegin.shoping.GdComditytypeFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @DATA 2019-04-21 14:45
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@Api(description = "商品类别")
@Slf4j
@RestController
@RequestMapping("/unification")
public class GdComditytypeController {

    @Autowired
    GdComditytypeFeignService  gdComditytypeFeignService;

    @GetMapping("/selTypeAll")
    public ResponseData<List<GdComditytypeDTO>> selTypeAll()
    {
        return gdComditytypeFeignService.selTypeAll();
    }


    @PostMapping("/sevaType")
    public ResponseData<Integer> sevaType(@RequestBody RequestData<GdComditytypeDTO> requestData)
    {
        ResponseData<Integer> responseData=new ResponseData<>();
        if (requestData.getData()!=null)
        {
            return gdComditytypeFeignService.sevaType(requestData);
        }
        responseData.setCode(Consts.Result.ERROR_PARAM.getCode());
        return responseData;
    }

    @PostMapping("/updateType")
    public ResponseData<Integer> updateType(@RequestBody RequestData<GdComditytypeDTO> requestData)
    {
        ResponseData<Integer> responseData=new ResponseData<>();
        if (requestData.getData()!=null)
        {
            return gdComditytypeFeignService.updateType(requestData);
        }
        responseData.setCode(Consts.Result.ERROR_PARAM.getCode());
        return responseData;
    }
}
