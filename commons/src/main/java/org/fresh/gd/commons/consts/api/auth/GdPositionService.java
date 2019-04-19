package org.fresh.gd.commons.consts.api.auth;

import io.swagger.models.auth.In;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.management.GdStoreDTO;
import org.fresh.gd.commons.consts.pojo.dto.oauth.GdPositionDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @DATA 2019-04-19 17:04
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */
@RequestMapping("/GdPositionService")
public interface GdPositionService {

    @PostMapping("/savaPosn")
    public ResponseData<Integer> savaPosn(RequestData<GdPositionDTO> requestData);

}
