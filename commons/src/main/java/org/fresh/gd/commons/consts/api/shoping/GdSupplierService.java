package org.fresh.gd.commons.consts.api.shoping;

import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdSupplierDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @DATA 2019-04-22 10:21
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */
@RequestMapping("/GdSupplierService")
public interface GdSupplierService {


    /**
     * 功能描述
     * 添加供应商信息
     * @param requestData
     * @return org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
     * @author zgw
     */
    @PostMapping("/saveSupplier")
    ResponseData<Integer> saveSupplier(RequestData<GdSupplierDTO> requestData);

}
