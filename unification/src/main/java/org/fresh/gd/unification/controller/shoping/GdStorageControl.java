package org.fresh.gd.unification.controller.shoping;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.fresh.gd.commons.consts.consts.Consts;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.management.GdStoreDTO;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdReplenishDTO;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdStorageDTO;
import org.fresh.gd.unification.fegin.shoping.GdStorageFeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @DATA 2019/4/29 15:53
 * @Author 郭家恒
 * @Description TODO
 */
@Api(description = "入库管控")
@Slf4j
@RestController
@RequestMapping("/unification")
public class GdStorageControl {
    @Autowired
    private GdStorageFeginService gdStorageFeginService;

    @PostMapping("/updStorage")
    public ResponseData<Integer> updStorage(@RequestBody RequestData<GdStorageDTO> requestData) {
        ResponseData<Integer> responseData = new ResponseData<>();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        responseData = (gdStorageFeginService.saveStora(requestData));
        return responseData;
    }
}
