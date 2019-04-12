package org.fresh.gd.commons.consts.advice;

import lombok.extern.slf4j.Slf4j;
import org.fresh.gd.commons.consts.consts.Consts;
import org.fresh.gd.commons.consts.exceptions.BizException;
import org.fresh.gd.commons.consts.pojo.ResponseData;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@Slf4j
@ControllerAdvice
public class CommonControllerAdvice
{
    @ExceptionHandler({Exception.class})
    @ResponseBody
    public ResponseData<Void> errorHandle(Exception e) {
        log.error("" , e);
        if(e instanceof BizException)
        {
            ResponseData<Void> responseData = new ResponseData<>();
            responseData.setMsg(e.getMessage());
            responseData.setCode(Consts.Result.BIZ_ERROR.getCode());
            return responseData;
        } else
        {
            ResponseData<Void> responseData = new ResponseData<>();
            responseData.setMsg(Consts.Result.BIZ_ERROR.getMsg());
            responseData.setCode(Consts.Result.BIZ_ERROR.getCode());
            return responseData;
        }

    }
}
