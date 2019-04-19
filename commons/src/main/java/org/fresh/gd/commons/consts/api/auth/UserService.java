package org.fresh.gd.commons.consts.api.auth;

import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.oauth.UserDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @DATA 2019-04-19 14:04
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO 用户信息接口
 */
@RequestMapping("/UserService")
public interface UserService {
    /**
     * 功能描述
     * 添加员工信息
     *
     * @param requestData
     * @return org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
     * @author zgw
     */
    @PostMapping("/saveUser")
    ResponseData<Integer> saveUser(RequestData<UserDTO> requestData);

    /**
     * 功能描述
     * 查询所有员工 以及所在门店
     * @param requestData
     * @return org.fresh.gd.commons.consts.pojo.ResponseData<java.util.List < org.fresh.gd.commons.consts.pojo.dto.oauth.UserDTO>>
     * @author zgw
     */
    @PostMapping("/selAllAndByUsername")
    ResponseData<List<UserDTO>> selAllAndByUsername(RequestData<UserDTO> requestData);

}
