package org.fresh.gd.commons.consts.api.qcloudsms;

import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @DATA 2019/4/25 18:16
 * @Author 郭家恒
 * @Description TODO
 */
@RequestMapping("/CloudMdSms")
public interface CloudMdSmsServe {
    @PostMapping("/mdSms")
    String mdSms(String phone);
}
