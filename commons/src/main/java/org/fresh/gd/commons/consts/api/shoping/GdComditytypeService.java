package org.fresh.gd.commons.consts.api.shoping;

import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.shoping.GdComditytypeDTO;
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


    /** 功能描述:
    * 根据分id删除分类
    * @param: [requestData]
    * @return: org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
    * @auther: 郭家恒
    * @date: 2019/4/26 15:24
    */
    @PostMapping("/delType")
    ResponseData<Integer> delType(RequestData<Integer> requestData);

}
