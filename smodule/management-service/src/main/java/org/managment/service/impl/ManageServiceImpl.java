package org.managment.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.commons.lang.StringUtils;
import org.fresh.gd.commons.consts.api.management.ManageService;
import org.fresh.gd.commons.consts.consts.Consts;
import org.fresh.gd.commons.consts.exceptions.BizException;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;

import org.fresh.gd.commons.consts.pojo.dto.management.GdStoreDTO;
import org.fresh.gd.commons.consts.pojo.dto.management.ManageStoreDTO;
import org.fresh.gd.commons.consts.pojo.dto.oauth.UserDTO;
import org.managment.service.entity.GdStore;
import org.managment.service.mapper.GdStoreMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public ResponseData<Integer> inserStore(@RequestBody GdStoreDTO requestData) {
        ResponseData<Integer> responseData = new ResponseData<>();
        String storename = requestData.getStorename();
        if (StringUtils.isEmpty(storename)) {
            throw new BizException("门店名称不能为空");
        }
        ManageStoreDTO manageStoreDTO = gdStoreMapper.selByName(storename);
        if (manageStoreDTO != null) {
            throw new BizException("门店名称不能重复");
        }


        GdStore gdStore = new GdStore();
        gdStore.setStorename(requestData.getStorename());
        gdStore.setStoreaddress(requestData.getStoreaddress());
        Integer save = gdStoreMapper.save(gdStore);

        if (save > 0) {
            responseData.setCode(Consts.Result.SUCCESS.getCode());
            ManageStoreDTO manage = new ManageStoreDTO();
            manage.setStoreid(gdStore.getStoreid());
            manage.setStoreImages(requestData.getStoreImagesUri());
            manageImageService.inserImagesStore(manage);

        }
        responseData.setCode(Consts.Result.ERROR_PARAM.getCode());
        return responseData;

    }

    @Override
    public ResponseData<List<GdStoreDTO>> selStroreByName(@RequestBody GdStoreDTO manageStoreDTO) {
        ResponseData<List<GdStoreDTO>> responseData = new ResponseData<>();
        List<GdStoreDTO> manageStoreDTOS = gdStoreMapper.selStoreAndImageByName(manageStoreDTO.getStorename());
        responseData.setData(manageStoreDTOS);
        return responseData;
    }


    @Override
    public ResponseData<Integer> delByIdStro(Integer storeid) {
        ResponseData<Integer> responseData = new ResponseData<>();

        Integer deleteByIdStro = gdStoreMapper.deleteByIdStro(storeid);
        if (deleteByIdStro > 0) {
            responseData.setCode(Consts.Result.SUCCESS.getCode());
        }
        return responseData;
    }


    @Override
    public ResponseData<List<GdStoreDTO>> selByYg(@RequestBody RequestData<List<UserDTO>> requestData) {
        ResponseData<List<GdStoreDTO>> responseData=new ResponseData<>();
        List<UserDTO> data = requestData.getData();

        List<GdStoreDTO> gdStoreDTOS = gdStoreMapper.selStoreAndImageByList(data);
        responseData.setData(gdStoreDTOS);

        return responseData;
    }


}
