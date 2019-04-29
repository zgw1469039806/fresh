package org.gw.shoping.impl;

import org.apache.commons.lang.StringUtils;
import org.fresh.gd.commons.consts.api.shoping.GdComditytypeService;
import org.fresh.gd.commons.consts.consts.Consts;
import org.fresh.gd.commons.consts.exceptions.BizException;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdActivitiesAndShopDTO;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdComditytypeDTO;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityDTO;
import org.gw.shoping.entity.GdCommodity;
import org.gw.shoping.mapper.GdComditytypeMapper;
import org.gw.shoping.mapper.GdCommodityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @DATA 2019-04-21 14:42
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@RestController
public class GdComditytypeServiceImpl implements GdComditytypeService {

    @Autowired
    GdComditytypeMapper gdComditytypeMapper;

    @Autowired
    GdCommodityMapper gdCommodityMapper;

    /**
     * 功能描述
     * 查询所有商品分类
     *
     * @return org.fresh.gd.commons.consts.pojo.ResponseData<java.util.List               <               org.fresh.gd.commons.consts.pojo.dto.shoping.GdComditytypeDTO>>
     * @author zgw
     */
    @Override
    public ResponseData<List<GdComditytypeDTO>> selTypeAll() {
        ResponseData<List<GdComditytypeDTO>> responseData = new ResponseData<>();
        responseData.setData(gdComditytypeMapper.selTypeAll());
        return responseData;
    }

    /**
     * 功能描述
     * 添加一条类别
     *
     * @param dtoRequestData
     * @return org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
     * @author zgw
     */
    @Override
    public ResponseData<Integer> sevaType(@RequestBody RequestData<GdComditytypeDTO> dtoRequestData) {
        ResponseData<Integer> responseData = new ResponseData<>();
        GdComditytypeDTO gdComditytypeDTO = dtoRequestData.getData();
        if (StringUtils.isEmpty(gdComditytypeDTO.getTypename())) {
            throw new BizException("类型不能为空");
        }
        Integer seva = gdComditytypeMapper.savaType(gdComditytypeDTO);
        if (seva > 0) {
            return responseData;
        }
        responseData.setCode(Consts.Result.BIZ_ERROR.getCode());
        return responseData;
    }

    /**
     * 功能描述
     * 根据ID修改类型
     *
     * @param dtoRequestData
     * @return org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
     * @author zgw
     */
    @Override
    public ResponseData<Integer> updateType(@RequestBody RequestData<GdComditytypeDTO> dtoRequestData) {
        ResponseData<Integer> responseData = new ResponseData<>();
        GdComditytypeDTO gdComditytypeDTO = dtoRequestData.getData();
        if (StringUtils.isEmpty(dtoRequestData.getData().getTypename())) {
            throw new BizException("类型名称不能为空");
        }
        Integer updateType = gdComditytypeMapper.updateType(gdComditytypeDTO);
        if (updateType > 0) {
            return responseData;
        }
        responseData.setCode(Consts.Result.ERROR_PARAM.getCode());
        return responseData;
    }

    @Override
    public ResponseData<Integer> delType(@RequestBody RequestData<Integer> requestData) {
        ResponseData<Integer> responseData = new ResponseData<>();
        List<GdCommodityDTO> list = gdCommodityMapper.QueryComByType(requestData.getData());
        if (list.size() == 0) {
            int del = gdComditytypeMapper.delType(requestData.getData());
            if (del > 0) {
                responseData.setMsg("删除成功");
            }
        } else {
            responseData.setMsg("分类下有商品");
        }
        return responseData;
    }

    /**
     * 功能描述
     * 根据活动ID 查询商品
     *
     * @param requestData
     * @return org.fresh.gd.commons.consts.pojo.ResponseData<java.util.List < org.fresh.gd.commons.consts.pojo.dto.shoping.GdActivitiesAndShopDTO>>
     * @author zgw
     */
    @Override
    public ResponseData<List<GdActivitiesAndShopDTO>> selActAndShop(Integer requestData) {
        ResponseData<List<GdActivitiesAndShopDTO>> responseData=new ResponseData<>();

        if (requestData==0 || requestData == null)
        {
            throw new BizException("活动ID不能为空");
        }


        List<GdActivitiesAndShopDTO> gdActivitiesAndShopDTOS = gdCommodityMapper.selGdActivAndShop(requestData);
        responseData.setData(gdActivitiesAndShopDTOS);
        return responseData;
    }

    @Override
    public ResponseData<List<GdActivitiesAndShopDTO>> selGdActivAndShopLike(String requestData)
    {
        ResponseData<List<GdActivitiesAndShopDTO>> responseData=new ResponseData<>();

        if (StringUtils.isEmpty(requestData))
        {
            throw new BizException("商品名称不能为空");
        }

        List<GdActivitiesAndShopDTO> gdActivitiesAndShopDTOS = gdCommodityMapper.selGdActivAndShopLike(requestData);
        responseData.setData(gdActivitiesAndShopDTOS);

        return responseData;
    }
}
