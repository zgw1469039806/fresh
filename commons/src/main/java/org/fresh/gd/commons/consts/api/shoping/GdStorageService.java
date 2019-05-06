package org.fresh.gd.commons.consts.api.shoping;

import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.management.GdStoreDTO;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdStorageDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 入库接口
 * @DATA 2019/4/29 15:05
 * @Author 郭家恒
 * @Description TODO
 */
@RequestMapping("/GdStorageService")
public interface GdStorageService {
    /** 功能描述:
    * 入库
    * @param: [requestData]
    * @return: javax.xml.ws.Response<java.lang.Integer>
    * @auther: 郭家恒
    * @date: 2019/4/29 15:08
    */
    @PostMapping("/saveStora")
    ResponseData<Integer> saveStora(RequestData<GdStorageDTO> requestData);
}
