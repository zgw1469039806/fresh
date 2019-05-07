package org.auth.client.impl;

import com.codingapi.tx.annotation.TxTransaction;
import org.apache.commons.lang.StringUtils;
import org.auth.client.entity.GdUser;
import org.auth.client.fegin.ManageFeignService;
import org.auth.client.mapper.GdUserMapper;
import org.fresh.gd.commons.consts.api.auth.UserService;
import org.fresh.gd.commons.consts.consts.Consts;
import org.fresh.gd.commons.consts.exceptions.BizException;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.management.GdStoreDTO;
import org.fresh.gd.commons.consts.pojo.dto.oauth.GdPositionDTO;
import org.fresh.gd.commons.consts.pojo.dto.oauth.UserDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @DATA 2019-04-19 14:10
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@RestController
public class UserServiceImpl implements UserService {

    @Autowired
    GdPositionServiceImpl gdPositionService;

    @Autowired
    GdUserMapper gdUserMapper;

    @Autowired
    public PasswordEncoder passwordEncoder;

    @Autowired
    ManageFeignService manageFeignService;

    @Transactional
    @Override
    public ResponseData<Integer> saveUser(@RequestBody RequestData<UserDTO> requestData) {
        ResponseData<Integer> responseData=new ResponseData<>();
        UserDTO userDTO=requestData.getData();
        System.err.println("----"+userDTO);
        GdUser gdUserTwo = gdUserMapper.selUserAcc(userDTO.getUseraccount());

        if (gdUserTwo!=null)
        {
            throw new BizException("账号不能重复");
        }
        if (StringUtils.isEmpty(userDTO.getPhone()))
        {
            throw new BizException("手机号不能为空");
        }
        userDTO.setPassword(passwordEncoder.encode("123456"));
        GdUser gdUser=new GdUser();
        BeanUtils.copyProperties(userDTO,gdUser);
        Integer usersave = gdUserMapper.saveUserYg(gdUser);
        if (usersave>0)
        {
            GdPositionDTO gdPositionDTO=new GdPositionDTO();
            gdPositionDTO.setUserId(gdUser.getUserId());
            gdPositionDTO.setPname(requestData.getData().getUsername());
            gdPositionService.savaPosn(gdPositionDTO);
            responseData.setMsg(Consts.Result.SUCCESS.getMsg());
            return responseData;
        }
        responseData.setMsg(Consts.Result.BIZ_ERROR.getMsg());
        return responseData;
    }

    /**
     * 功能描述
     * 查询所有员工 以及所在门店
     *
     * @param requestData
     * @return org.fresh.gd.commons.consts.pojo.ResponseData<java.util.List < org.fresh.gd.commons.consts.pojo.dto.oauth.UserDTO>>
     * @author zgw
     */
    @Override
    public ResponseData<List<UserDTO>> selAllAndByUsername(@RequestBody RequestData<UserDTO> requestData)
    {
        RequestData<List<UserDTO>> listRequestData=new RequestData<>();
        ResponseData<List<UserDTO>> listResponseData=new ResponseData<>();


        List<UserDTO> userDTOS = gdUserMapper.selYgByMd(requestData.getData().getUseraccount());

        listRequestData.setData(userDTOS);
        ResponseData<List<GdStoreDTO>> gdStoreDTOResponseData = manageFeignService.selByYg(listRequestData);

        List<GdStoreDTO> data = gdStoreDTOResponseData.getData();
        for (UserDTO userDTO:userDTOS)
        {
          for (GdStoreDTO gdStoreDTO:data)
          {
            if (userDTO.getIsnoYg().equals(gdStoreDTO.getStoreid().toString())){
                userDTO.setGdStoreName(gdStoreDTO.getStorename());
                userDTO.setStoreaddress(gdStoreDTO.getStoreaddress());
                break;
            }
          }
        }
        listResponseData.setData(userDTOS);
        return listResponseData;
    }
}
