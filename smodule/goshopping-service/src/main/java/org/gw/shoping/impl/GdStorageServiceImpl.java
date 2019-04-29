package org.gw.shoping.impl;

import org.fresh.gd.commons.consts.api.shoping.GdStorageService;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdStorageDTO;
import org.gw.shoping.mapper.GdReplenishMapper;
import org.gw.shoping.mapper.GdStorageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @DATA 2019/4/29 15:09
 * @Author 郭家恒
 * @Description TODO
 */
@RestController
public class GdStorageServiceImpl implements GdStorageService {
    @Autowired
    private GdStorageMapper gdStorageMapper;

    /**
     * 功能描述:
     * 入库
     *
     * @param requestData
     * @param: [requestData]
     * @return: javax.xml.ws.Response<java.lang.Integer>
     * @auther: 郭家恒
     * @date: 2019/4/29 15:08
     */
    @Override
    public ResponseData<Integer> saveStora(@RequestBody RequestData<GdStorageDTO> requestData) {
        ResponseData<Integer> responseData = new ResponseData<>();
        int save = gdStorageMapper.saveStorage(requestData.getData());
        if (save > 0) {
            System.out.println("入库成功");
        }
        responseData.setData(save);
        return responseData;
    }
}
