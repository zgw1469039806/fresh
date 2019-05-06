package org.fresh.gd.commons.consts.api.shoping;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdComditynameDTO;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityDTO;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityListDTO;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdinventoryallDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @DATA 2019-04-21 11:17
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO 查询所有商品
 */
@RequestMapping("/GdCommodityService")
public interface GdCommodityService {


    /**
     * 功能描述
     * 查询所有商品
     *
     * @param
     * @return org.fresh.gd.commons.consts.pojo.ResponseData<java.util.List                               <                               org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityDTO>>
     * @author zgw
     */
    @GetMapping("/selShopingAll")
    public ResponseData<List<GdCommodityDTO>> selShopingAll();


    /**
     * 功能描述
     * 查询商品信息 商品详情带分页
     *
     * @param
     * @return org.fresh.gd.commons.consts.pojo.ResponseData<com.baomidou.mybatisplus.extension.plugins.pagination.Page                               <                               org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityDTO>>
     * @author zgw
     */
    @PostMapping("/selPageShop")
    ResponseData<Page<GdCommodityDTO>> selPageShop(RequestData<GdCommodityDTO> gdCommodityDTORequestData);


    /**
     * @Author: JYF on 2019/4/24 8:55
     * @param:
     * @return: ResponseData<List               <               GdCommodityListDTO>>
     * @Description: 查询主页显示的商品信息
     */
    @GetMapping("/selheadlineAll")
    ResponseData<List<GdCommodityListDTO>> selheadlineAll();

    /**
     * @Author: JYF on 2019/4/24 8:57
     * @param: comdityId 商品ID
     * @return:
     * @Description:
     */
    @PostMapping("/selOne")
    ResponseData<GdCommodityListDTO> selOne(Integer comdityId);


    /**
     * 功能描述
     * 货品详情信息
     *
     * @return org.fresh.gd.commons.consts.pojo.ResponseData<org.fresh.gd.commons.consts.pojo.dto.shoping.GdinventoryallDTO>
     * @author zgw
     */
    @PostMapping("/nventoryall")
    ResponseData<List<GdinventoryallDTO>> nventoryall(RequestData<GdComditynameDTO> requestData);

    /**
     * 功能描述:
     * 根据分类查询商品
     *
     * @param: [requestData]
     * @return: org.fresh.gd.commons.consts.pojo.ResponseData<java.util.List   <   org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityDTO>>
     * @auther: 郭家恒
     * @date: 2019/4/28 15:20
     */
    @PostMapping("/QueryComByType")
    ResponseData<List<GdCommodityDTO>> QueryComByType(RequestData<Integer> requestData);
}
