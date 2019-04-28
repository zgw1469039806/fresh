package org.gw.shoping.impl;

import org.apache.commons.lang.StringUtils;
import org.fresh.gd.commons.consts.api.shoping.GdSupplierService;
import org.fresh.gd.commons.consts.consts.Consts;
import org.fresh.gd.commons.consts.exceptions.BizException;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdSupplierDTO;
import org.gw.shoping.mapper.GdSupplierMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * @DATA 2019-04-22 10:24
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@RestController
public class GdSupplierServiceImpl  implements GdSupplierService {

    @Autowired
    GdSupplierMapper gdSupplierMapper;

    /**
     * 功能描述
     * 添加供应商信息
     *
     * @param requestData
     * @return org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
     * @author zgw
     */
    @Override
    public ResponseData<Integer> saveSupplier(@RequestBody RequestData<GdSupplierDTO> requestData) {
        ResponseData<Integer>responseData=new ResponseData<>();

        GdSupplierDTO gdSupplierDTO=requestData.getData();
        GdSupplierDTO gdSupplier= gdSupplierMapper.selByName(gdSupplierDTO.getSupplierName());
        if (gdSupplier!=null)
        {
            throw new BizException("供应商名字不能重复");
        }

        gdSupplierDTO.setSupplierBM(Consts.getStringRandom(8).toUpperCase());
        Integer saveSupplier = gdSupplierMapper.saveSupplier(gdSupplierDTO);
        if (saveSupplier>0)
        {
            return responseData;
        }
        responseData.setCode(Consts.Result.ERROR_PARAM.getCode());

        return responseData;
    }

    @Override
    public ResponseData<List<GdSupplierDTO>> QuerySypplier() {
        List<GdSupplierDTO> supplierDTOS = gdSupplierMapper.QueryAll();
        ResponseData<List<GdSupplierDTO>> responseData = new ResponseData<>();
        responseData.setData(supplierDTOS);
        return responseData;
    }
}
