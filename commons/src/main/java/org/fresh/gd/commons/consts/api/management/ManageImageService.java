package org.fresh.gd.commons.consts.api.management;

import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.management.ManageStoreDTO;


/**
 * @DATA 2019-04-17 14:36
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */
public interface ManageImageService {

    /**
     * 功能描述
     * 添加门店图片
     * @param requestData
     * @return org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
     * @author zgw
     */
    ResponseData<Integer> inserImagesStore(RequestData<ManageStoreDTO> requestData);
}
