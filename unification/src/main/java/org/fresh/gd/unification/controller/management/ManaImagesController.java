package org.fresh.gd.unification.controller.management;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.management.GdStoreDTO;
import org.fresh.gd.unification.fegin.management.ManaImagesFeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @DATA 2019-04-19 11:16
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@Api(description = "门店图片操作")
@Slf4j
@RestController
@RequestMapping("/unification")
public class ManaImagesController {

    @Autowired
    ManaImagesFeginService manaImagesFeginService;


    @PostMapping("/delImages")
    public ResponseData<Integer> delImages(@RequestBody GdStoreDTO gdStoreDTO)
    {
      return  manaImagesFeginService.delByIdImages(gdStoreDTO);
    }


}
