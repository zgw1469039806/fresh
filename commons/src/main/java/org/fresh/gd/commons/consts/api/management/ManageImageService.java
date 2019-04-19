package org.fresh.gd.commons.consts.api.management;

import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.management.GdStoreDTO;
import org.fresh.gd.commons.consts.pojo.dto.management.ManageStoreDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @DATA 2019-04-17 14:36
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO 门店图片接口
 */
@RequestMapping("/ManageImageService")
public interface ManageImageService {

    /**
     * 功能描述
     * 添加门店图片
     * @param manageStoreDTO
     * @return org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
     * @author zgw
     */
    @RequestMapping(value = "/inserImagesStore", method = RequestMethod.POST)
    ResponseData<Integer> inserImagesStore(ManageStoreDTO manageStoreDTO);


    @RequestMapping(value = "/delByIdImages", method = RequestMethod.POST)
    ResponseData<Integer> delByIdImages(GdStoreDTO gdStoreDTO);
}
