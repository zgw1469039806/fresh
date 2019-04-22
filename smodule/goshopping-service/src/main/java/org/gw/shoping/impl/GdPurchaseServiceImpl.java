package org.gw.shoping.impl;

import org.fresh.gd.commons.consts.api.shoping.GdPurchaseService;
import org.fresh.gd.commons.consts.consts.Consts;
import org.fresh.gd.commons.consts.exceptions.BizException;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdPurchaseDTO;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdReplenishDTO;
import org.gw.shoping.mapper.GdPurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @DATA 2019-04-22 14:48
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@RestController
public class GdPurchaseServiceImpl implements GdPurchaseService {

    @Autowired
    GdPurchaseMapper gdPurchaseMapper;

    /**
     * 功能描述
     * 添加进货管控同时添加进货详情
     * @param requestData
     * @return org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
     * @author zgw
     */
    @Override
    public ResponseData<Integer> saveGdPurchase(@RequestBody RequestData<GdReplenishDTO> requestData)
    {
        ResponseData<Integer> responseData=new ResponseData<>();
        GdReplenishDTO gdReplenishDTO= requestData.getData();
        for (GdPurchaseDTO gdPurchaseDTO:gdReplenishDTO.getList())
        {
            if (gdPurchaseDTO.getShopId()==0 && gdPurchaseDTO.getShopId() == null)
            {
                throw new BizException("商品ID不能为空");
            }
        }
        Integer savePurchase = gdPurchaseMapper.savePurchase(gdReplenishDTO.getList());
        if (savePurchase>0)
        {
            return responseData;
        }
        responseData.setCode(Consts.Result.ERROR_PARAM.getCode());
        return responseData;
    }
}
