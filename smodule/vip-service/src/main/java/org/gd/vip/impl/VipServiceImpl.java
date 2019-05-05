package org.gd.vip.impl;

import org.fresh.gd.commons.consts.api.vip.VipService;
import org.fresh.gd.commons.consts.consts.Consts;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.user.UserAndVipDTO;
import org.fresh.gd.commons.consts.pojo.dto.vip.GdAddVipDTO;
import org.fresh.gd.commons.consts.pojo.dto.vip.SelPageVipDTO;
import org.fresh.gd.commons.consts.pojo.dto.vip.VipPageDTO;
import org.fresh.gd.commons.consts.utils.PageBean;
import org.fresh.gd.commons.consts.utils.VeDate;
import org.gd.vip.entity.GdVip;
import org.gd.vip.mapper.GdVipMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @author 贾轶飞
 * @date 2019/4/26 13:19
 */
@RestController
public class VipServiceImpl implements VipService {
    @Autowired
    GdVipMapper gdVipMapper;

    @Override
    public ResponseData<UserAndVipDTO> selectOne(@RequestBody RequestData<UserAndVipDTO> requestData) {
        ResponseData<UserAndVipDTO> responseData=new ResponseData<>();
        responseData.setData(gdVipMapper.selevtOne(requestData.getData().getUserId()));

        return responseData;
    }

    /**
     * 功能描述:
     * 新增会员
     * @param dtogdAddVipDTO
     * @return: org.fresh.gd.commons.consts.pojo.ResponseData<java.lang.Integer>
     * @auther: Mr.Xia
     * @date: 2019/4/28 13:47
     */
    @Override
    public ResponseData<Integer> addVip(@RequestBody RequestData<GdAddVipDTO> dtogdAddVipDTO) {
        ResponseData<Integer> responseData = new ResponseData<>();
        GdAddVipDTO dtovip = dtogdAddVipDTO.getData();
        Random re = new Random();
        int i = re.nextInt(10000);
        GdVip vip = new GdVip();
        //会员卡号随机数  当前时间加上随机数
        vip.setVipId((new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())) + i);
        vip.setUserId(null);
        vip.setVipbalance(dtovip.getVipbalance());
        vip.setVipeportTime(null);
        vip.setViplv(dtovip.getViplv());
        vip.setVipintegral(dtovip.getVipintegral());
        vip.setVipName(dtovip.getVipName());
        vip.setVipphone(dtovip.getVipphone());
        vip.setVipreport(0);
        vip.setVipStartTime(VeDate.getStringDate());
        Integer in = gdVipMapper.addVip(vip);
        if( in > 0 ){
            return responseData;
        }
        responseData.setCode(Consts.Result.BIZ_ERROR.getCode());
        return responseData;
    }

    /**
     * 功能描述:
     * 分页显示会员信息
     *
     * @param pageVipdto
     * @param: [pageVipdto]
     * @return: org.fresh.gd.commons.consts.pojo.ResponseData<org.fresh.gd.commons.consts.utils.PageBean < org.fresh.gd.commons.consts.pojo.dto.vip.VipPageDTO>>
     * @auther: Mr.Xia
     * @date: 2019/4/29 15:43
     */
    @Override
    public ResponseData<PageBean<VipPageDTO>> selPageListVip(@RequestBody RequestData<SelPageVipDTO> pageVipdto) {
        ResponseData<PageBean<VipPageDTO>> responseData = new ResponseData<>();
        //传过来的参数
        SelPageVipDTO selPageVipDTO = pageVipdto.getData();
        selPageVipDTO.setPageNo(selPageVipDTO.getPageNo() - 1);

        //查到的vip列表数据
        List<VipPageDTO> vipPageDTO = gdVipMapper.selPageListVip(selPageVipDTO);

        //查询总数
        Integer count = this.selPageCountVip(selPageVipDTO.getVipName(),selPageVipDTO.getViplv());

        //计算总页数
        Integer countPage = 0;
        if(count % selPageVipDTO.getPageSize() == 0){
            countPage = count / selPageVipDTO.getPageSize();
        }else{
            countPage = count / selPageVipDTO.getPageSize() + 1;
        }


        PageBean<VipPageDTO> pageDTOPageBean = new PageBean<>();
        pageDTOPageBean.setTotalCount(count);
        pageDTOPageBean.setList(vipPageDTO);
        pageDTOPageBean.setTotalPage(countPage);
        pageDTOPageBean.setCurrPage(selPageVipDTO.getPageNo());
        pageDTOPageBean.setPageSize(selPageVipDTO.getPageSize());

        responseData.setData(pageDTOPageBean);

        return responseData;
    }

    /**
     * 功能描述:
     * 条件查询vip总数
     *
     * @auther: Mr.Xia
     * @date: 2019/4/29 16:05
     */
    @Override
    public Integer selPageCountVip(String vipName , Integer Viplv) {
        return gdVipMapper.selPageCountVip(vipName, Viplv);
    }
}
