package org.managment.service.impl;

import org.apache.commons.lang.StringUtils;
import org.fresh.gd.commons.consts.api.management.ManageImageService;
import org.fresh.gd.commons.consts.consts.Consts;
import org.fresh.gd.commons.consts.exceptions.BizException;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.management.ManageStoreDTO;
import org.managment.service.entity.GdStoreimage;
import org.managment.service.mapper.GdStoreimageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @DATA 2019-04-18 15:07
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@RestController
public class ManageImageServiceImpl implements ManageImageService {

    @Autowired
    GdStoreimageMapper gdStoreimageMapper;


    @Override
    public ResponseData<Integer> inserImagesStore(@RequestBody ManageStoreDTO manageStoreDTO)
    {
        ResponseData<Integer> responseData = new ResponseData<>();

        if (StringUtils.isEmpty(manageStoreDTO.getStoreImages()))
        {
            throw new BizException("图片地址不能为空");
        }
        GdStoreimage gdStoreimag = new GdStoreimage();
        gdStoreimag.setStoreid(manageStoreDTO.getStoreid().toString());
        gdStoreimag.setStoreImages(manageStoreDTO.getStoreImages());
        Integer saveO = gdStoreimageMapper.saveImage(gdStoreimag);

        if (saveO>0)
        {
            responseData.setCode(Consts.Result.SUCCESS.getCode());
            return responseData;
        }
        responseData.setCode(Consts.Result.BIZ_ERROR.getCode());
        return responseData;
    }
}
