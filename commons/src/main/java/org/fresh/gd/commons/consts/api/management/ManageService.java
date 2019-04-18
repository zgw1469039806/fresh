package org.fresh.gd.commons.consts.api.management;

import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.management.ManageStoreDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @DATA 2019-04-17 14:36
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */
@RequestMapping("/manageService")
public interface ManageService {

    /**
     * 功能描述
     * 添加门店信息
     *
     * @param
     * @return org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
     * @author zgw
     */
    @RequestMapping(value = "/inserStore", method = RequestMethod.POST)
    ResponseData<Integer> inserStore(RequestData<ManageStoreDTO> requestData);

    @RequestMapping("/test")
    String test();

}
