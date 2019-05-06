package org.fresh.gd.unification.controller.auth;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.oauth.UserDTO;
import org.fresh.gd.unification.fegin.auth.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @DATA 2019-04-19 14:30
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@Api(description = "添加用户信息")
@Slf4j
@RestController
@RequestMapping("/unification")
public class UserAuthController {

    @Autowired
    UserFeignService userFeignService;

    /**
     * 功能描述
     * 添加员工信息  员工为当前门店下
     *
     * @param requestData
     * @return org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
     * @author zgw
     */
    @PostMapping("/savaRoot")
    public ResponseData<Integer> savaRoot(@RequestBody RequestData<UserDTO> requestData)
    {
        return userFeignService.saveUser(requestData);
    }

    /**
     * 功能描述
     * 查询所有员工信息，还要员工所在的门店名称
     *
     * @param requestData
     * @return org.fresh.gd.commons.consts.pojo.ResponseData<java.util.List < org.fresh.gd.commons.consts.pojo.dto.oauth.UserDTO>>
     * @author zgw
     */
    @PostMapping("/selAllAndByUsername")
    public ResponseData<List<UserDTO>> selAllAndByUsername(@RequestBody RequestData<UserDTO> requestData)
    {
        return userFeignService.selAllAndByUsername(requestData);
    }
}
