package org.fresh.gd.commons.consts.api.shoping;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import feign.RequestLine;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdComditytypeDTO;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @DATA 2019-04-21 14:41
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */
@RequestMapping("/GdComditytypeService")
public interface GdComditytypeService {

    /**
     * 功能描述
     * 查询所有商品分类
     *
     * @param
     * @return org.fresh.gd.commons.consts.pojo.ResponseData<java.util.List < org.fresh.gd.commons.consts.pojo.dto.shoping.GdComditytypeDTO>>
     * @author zgw
     */
    @GetMapping("/selTypeAll")
    ResponseData<List<GdComditytypeDTO>> selTypeAll();

    /**
     * 功能描述
     * 添加一条类别
     *
     * @param dtoRequestData
     * @return org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
     * @author zgw
     */
    @PostMapping("/sevaType")
    ResponseData<Integer> sevaType(RequestData<GdComditytypeDTO> dtoRequestData);

    /**
     * 功能描述
     * 根据ID修改类型
     *
     * @param dtoRequestData
     * @return org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
     * @author zgw
     */
    @PostMapping("/updateType")
    ResponseData<Integer> updateType(RequestData<GdComditytypeDTO> dtoRequestData);



}
