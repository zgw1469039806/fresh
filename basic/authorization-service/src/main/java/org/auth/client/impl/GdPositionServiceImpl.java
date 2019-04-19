package org.auth.client.impl;

import org.apache.commons.lang.StringUtils;
import org.auth.client.entity.GdPosition;
import org.auth.client.mapper.GdPositionMapper;
import org.fresh.gd.commons.consts.api.auth.GdPositionService;
import org.fresh.gd.commons.consts.consts.Consts;
import org.fresh.gd.commons.consts.exceptions.BizException;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.oauth.GdPositionDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @DATA 2019-04-19 17:08
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@RestController
public class GdPositionServiceImpl implements GdPositionService {

    @Autowired
    GdPositionMapper  gdPositionMapper;

    @Override
    public ResponseData<Integer> savaPosn(@RequestBody RequestData<GdPositionDTO> requestData)
    {
        ResponseData<Integer> responseData=new ResponseData<>();
        if (StringUtils.isEmpty(requestData.getData().getUserId().toString()))
        {
            throw new BizException("用户ID不能为空");
        }
        GdPositionDTO gdPositionDTO=requestData.getData();
        GdPosition gdPosition=new GdPosition();
        BeanUtils.copyProperties(gdPositionDTO,gdPosition);
        Integer savePosn = gdPositionMapper.savaPoson(gdPosition);
        if (savePosn>0)
        {
            responseData.setCode(Consts.Result.SUCCESS.getCode());
            return responseData;
        }
        responseData.setCode(Consts.Result.ERROR_PARAM.getCode());

        return responseData;
    }
}
