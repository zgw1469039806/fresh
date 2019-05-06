package org.fresh.gd.commons.consts.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;


@ApiModel("请求服务的最基本参数")
@Data
public class RequestData<T> {

    @ApiModelProperty("当前时间的毫秒数")
    private long time;
    @ApiModelProperty("当前的服务版本号,默认为1.0.0")
    private String version = "1.0.0";
    @ApiModelProperty("参数签名")
    private String sign;
    @ApiModelProperty("请求的服务模块")
    private String module;
    private T data;

}
