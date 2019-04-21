package org.gw.shoping.impl;

import org.fresh.gd.commons.consts.api.shoping.GdCommodityService;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityDTO;
import org.gw.shoping.mapper.GdCommodityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @DATA 2019-04-21 11:26
 * @Author 张国伟  WeChat:17630376104
 * @Description 商品实现
 */
@RestController
public class GdCommodityServiceImpl  implements GdCommodityService {

    @Autowired
    GdCommodityMapper gdCommodityMapper;
    /**
     * 功能描述
     * 查询所有商品
     *
     * @return org.fresh.gd.commons.consts.pojo.ResponseData<java.util.List < org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityDTO>>
     * @author zgw
     */
    @Override
    public ResponseData<List<GdCommodityDTO>> selShopingAll() {
        ResponseData<List<GdCommodityDTO>> responseData=new ResponseData<>();

        List<GdCommodityDTO> gdCommodityDTOS = gdCommodityMapper.selShopAll();

        responseData.setData(gdCommodityDTOS);

        return responseData;
    }
}
