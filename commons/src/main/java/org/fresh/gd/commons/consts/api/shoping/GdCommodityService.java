package org.fresh.gd.commons.consts.api.shoping;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
     *  查询所有商品
     * @param
     * @return org.fresh.gd.commons.consts.pojo.ResponseData<java.util.List < org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityDTO>>
     * @author zgw
     */
    @GetMapping("/selShopingAll")
    public ResponseData<List<GdCommodityDTO>> selShopingAll();


    /**
     * 功能描述
     * 查询商品信息 商品详情带分页
     * @param
     * @return org.fresh.gd.commons.consts.pojo.ResponseData<com.baomidou.mybatisplus.extension.plugins.pagination.Page < org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityDTO>>
     * @author zgw
     */
    @PostMapping("/selPageShop")
    ResponseData<Page<GdCommodityDTO>> selPageShop(RequestData<GdCommodityDTO> gdCommodityDTORequestData);

}
