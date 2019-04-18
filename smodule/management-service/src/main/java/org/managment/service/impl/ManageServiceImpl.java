package org.managment.service.impl;

import org.apache.commons.lang.StringUtils;
import org.fresh.gd.commons.consts.api.management.ManageService;
import org.fresh.gd.commons.consts.consts.Consts;
import org.fresh.gd.commons.consts.exceptions.BizException;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;

import org.fresh.gd.commons.consts.pojo.dto.management.ManageStoreDTO;
import org.managment.service.entity.GdStore;
import org.managment.service.mapper.GdStoreMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @DATA 2019-04-17 14:48
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@RestController
public class ManageServiceImpl implements ManageService {

    @Autowired
    GdStoreMapper gdStoreMapper;

    @Autowired
    ManageImageServiceImpl manageImageService;

    @Transactional
    @Override
    public ResponseData<Integer> inserStore(@RequestBody ManageStoreDTO requestData) {
        ResponseData<Integer> responseData = new ResponseData<>();
        String storename = requestData.getStorename();
        if (StringUtils.isEmpty(storename))
        {
            throw new BizException("门店名称不能为空");
        }
        ManageStoreDTO manageStoreDTO = gdStoreMapper.selByName(storename);
        if (manageStoreDTO != null)
        {
            throw new BizException("门店名称不能重复");
        }
        GdStore gdStore = new GdStore();
        gdStore.setStorename(requestData.getStorename());
        gdStore.setStoreaddress(requestData.getStoreaddress());
//        BeanUtils.copyProperties(gdStore, data);
        Integer save = gdStoreMapper.save(gdStore);
        responseData.setCode(Consts.Result.SUCCESS.getCode());
        if (save > 0)
        {
            requestData.setStoreid(gdStore.getStoreid());
            manageImageService.inserImagesStore(requestData);

        }
        responseData.setCode(Consts.Result.ERROR_PARAM.getCode());
        return responseData;

    }



}
