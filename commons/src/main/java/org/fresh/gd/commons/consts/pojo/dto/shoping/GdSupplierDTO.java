package org.fresh.gd.commons.consts.pojo.dto.shoping;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @DATA 2019-04-22 10:20
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@ApiModel("提供商数据模型")
@Data
public class GdSupplierDTO {

    /**
     * 编码
     */
    @ApiModelProperty("编码")
    private String supplierBM;

    /**
     * 名称
     */
    @ApiModelProperty("名称")
    private String supplierName;
}
