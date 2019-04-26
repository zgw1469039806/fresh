package org.gw.shoping.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import org.fresh.gd.commons.consts.api.shoping.GdCommodityService;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.management.GdStoreDTO;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdComditynameDTO;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityDTO;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityListDTO;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdinventoryallDTO;
import org.gw.shoping.fegin.ManageFeginService;
import org.gw.shoping.mapper.GdCommodityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
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

    @Autowired
    ManageFeginService manageFeginService;
    /**
     * 功能描述
     * 查询所有商品
     *
     * @return org.fresh.gd.commons.consts.pojo.ResponseData<java.util.List < org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityDTO>>
     * @author zgw
     */
    @Override
    public ResponseData<List<GdCommodityDTO>> selShopingAll()

    {


        ResponseData<List<GdCommodityDTO>> responseData=new ResponseData<>();

        List<GdCommodityDTO> gdCommodityDTOS = gdCommodityMapper.selShopAllUser();

        responseData.setData(gdCommodityDTOS);

        return responseData;
    }

    /**
     * 功能描述
     * 查询商品信息 商品详情带分页
     *
     * @return org.fresh.gd.commons.consts.pojo.ResponseData<com.baomidou.mybatisplus.extension.plugins.pagination.Page < org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityDTO>>
     * @author zgw
     */
    @Override
    public ResponseData<Page<GdCommodityDTO>> selPageShop(@RequestBody RequestData<GdCommodityDTO> gdCommodityDTORequestData)
    {
      RequestData<List<GdCommodityDTO>> listRequestData=new RequestData<>();

        ResponseData<Page<GdCommodityDTO>> responseData=new ResponseData<>();
        GdCommodityDTO gdCommodityDTO=gdCommodityDTORequestData.getData();
        Page<GdCommodityDTO> page=new Page<>(gdCommodityDTO.getPageNo(),6);
        List<GdCommodityDTO> gdCommodityDTOS = gdCommodityMapper.selShopAllAdmin(page, gdCommodityDTO.getComdityname(), gdCommodityDTO.getStoreid(),gdCommodityDTO.getComditytypeId());
        if(gdCommodityDTOS==null)
        {
            return responseData;
        }
        listRequestData.setData(gdCommodityDTOS);
        ResponseData<List<GdStoreDTO>> listResponseData = manageFeginService.selByssmd(listRequestData);
        for (GdCommodityDTO commodity:gdCommodityDTOS)
        {
            for (GdStoreDTO store:listResponseData.getData())
            {
                if(commodity.getStoreid().equals(store.getStoreid()))
                {
                    commodity.setSsmdName(store.getStorename());
                    break;
                }
            }
        }
        page.setRecords(gdCommodityDTOS);
        responseData.setData(page);
        return responseData;
    }

    @Override
    public ResponseData<List<GdCommodityListDTO>> selheadlineAll() {
        ResponseData<List<GdCommodityListDTO>> responseData= new ResponseData<>();
        responseData.setData( gdCommodityMapper.selheadlineAll());

        return responseData;
    }

    @Override
    public ResponseData<GdCommodityListDTO> selOne(Integer comdityId) {
        ResponseData<GdCommodityListDTO> responseData =new ResponseData<>();
        responseData.setData(gdCommodityMapper.selOne(comdityId));
        return responseData;
    }

    /**
     * 功能描述
     * 货品详情信息
     * @param requestData
     * @return org.fresh.gd.commons.consts.pojo.ResponseData<org.fresh.gd.commons.consts.pojo.dto.shoping.GdinventoryallDTO>
     * @author zgw
     */
    @Override
    public ResponseData<List<GdinventoryallDTO>> nventoryall(@RequestBody RequestData<GdComditynameDTO> requestData)
    {
        RequestData<List<GdCommodityDTO>> listRequestData=new RequestData<>();
        List<GdCommodityDTO>  list= new ArrayList<>();
        ResponseData<List<GdinventoryallDTO>> responseData=new ResponseData<>();
        GdComditynameDTO gdComditynameDTO=requestData.getData();

        List<GdinventoryallDTO> nventoryallmap = gdCommodityMapper.nventoryallmap(gdComditynameDTO);
        for (GdinventoryallDTO dto:nventoryallmap){
            GdCommodityDTO commodityDTO = new GdCommodityDTO();
            commodityDTO.setStoreid(dto.getStoreid());
            list.add(commodityDTO);
        }
        listRequestData.setData(list);
        ResponseData<List<GdStoreDTO>> listResponseData = manageFeginService.selByssmd(listRequestData);
        for (GdinventoryallDTO commodity:nventoryallmap)
        {
            for (GdStoreDTO store:listResponseData.getData())
            {
                if(commodity.getStoreid().equals(store.getStoreid()))
                {
                    commodity.setStoreName(store.getStorename());
                    break;
                }
            }
        }
        responseData.setData(nventoryallmap);

        return responseData;
    }


}
