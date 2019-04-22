package org.gw.shoping.impl;

import org.apache.commons.lang.StringUtils;
import org.fresh.gd.commons.consts.api.shoping.GdReplenishService;
import org.fresh.gd.commons.consts.consts.Consts;
import org.fresh.gd.commons.consts.exceptions.BizException;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdPurchaseDTO;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdReplenishAndPurchaseDTO;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdReplenishDTO;
import org.fresh.gd.commons.consts.utils.VeDate;
import org.gw.shoping.mapper.GdReplenishMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @DATA 2019-04-22 11:11
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@RestController
public class GdReplenishServiceImpl implements GdReplenishService {

    @Autowired
    GdReplenishMapper gdReplenishMapper;

    @Autowired
    GdPurchaseServiceImpl gdPurchaseService;

    /**
     * 功能描述
     * 添加一条进货信息
     *
     * @param replenishDTORequestData
     * @return org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
     * @author zgw
     */
    @Override
    public ResponseData<Integer> saveGdReplenish(@RequestBody RequestData<GdReplenishDTO> replenishDTORequestData) {
        ResponseData<Integer> responseData = new ResponseData<>();
        GdReplenishDTO gdReplenishDTO = replenishDTORequestData.getData();
        if (StringUtils.isEmpty(gdReplenishDTO.getUsername())) {
            throw new BizException("制单人员不能为空");
        }
        if (gdReplenishDTO.getStoreid() == 0 || gdReplenishDTO.getStoreid() == null) {
            throw new BizException("店铺ID不能为空");
        }
        if (gdReplenishDTO.getSupplierID() == 0 || gdReplenishDTO.getSupplierID() == null) {
            throw new BizException("供应商ID不能为空");
        }
        gdReplenishDTO.setReceiptNo(Consts.getStringRandom(6).toUpperCase());
        gdReplenishDTO.setReplenishTime("" + VeDate.getStringDate());
        Integer saveGdReplen = gdReplenishMapper.saveGdReplen(gdReplenishDTO);

        for (GdPurchaseDTO gdPurchaseDTO : replenishDTORequestData.getData().getList()) {
            gdPurchaseDTO.setReplenishId(gdReplenishDTO.getReplenishId());
        }

        if (saveGdReplen > 0) {
            gdPurchaseService.saveGdPurchase(replenishDTORequestData);
            return responseData;
        }
        responseData.setCode(Consts.Result.ERROR_PARAM.getCode());

        return responseData;
    }

    /**
     * 功能描述
     * 入库前的查询  查询所有进货信息
     *
     * @return org.fresh.gd.commons.consts.pojo.ResponseData<java.util.List < org.fresh.gd.commons.consts.pojo.dto.shoping.GdReplenishAndPurchaseDTO>>
     * @author zgw
     */
    @Override
    public ResponseData<List<GdReplenishAndPurchaseDTO>> selReAndPuAll() {
        ResponseData<List<GdReplenishAndPurchaseDTO>> responseData=new ResponseData<>();
        List<GdReplenishAndPurchaseDTO> gdReplenishAndPurchaseDTOS = gdReplenishMapper.selReAndPuAll();
        responseData.setData(gdReplenishAndPurchaseDTOS);
        return responseData;
    }
}
