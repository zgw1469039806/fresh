package org.fresh.gd.commons.consts.pojo.dto.shoping;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @DATA 2019-04-22 11:01
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@ApiModel("进货管控")
@Data
public class GdReplenishDTO {
    /**
     * 进货ID
     */
    @ApiModelProperty("进货ID")
    private Integer replenishId;

    /**
     * 进货时间
     */
    @ApiModelProperty("进货时间")
    private String replenishTime;

    /**
     * 采购人员id
     */
    @ApiModelProperty("采购人员id")
    private String username;

    /**
     * 店铺ID
     */
    @ApiModelProperty("店铺ID")
    private Integer storeid;

    /**
     * 店铺名称
     */
    @ApiModelProperty("店铺名称")
    private String storename;

    /**
     * 提供商id
     */
    @ApiModelProperty("提供商id")
    private Integer supplierID;

    /**
     * 是否入库
     */
    @ApiModelProperty("是否入库")
    private Integer isnostorage;

    /**
     * 进货编号
     */
    @ApiModelProperty("进货编号")
    private String receiptNo;

    /**
     * 进货详细list
     */
    @ApiModelProperty("进货详细list")
    private List<GdPurchaseDTO> list;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    private String remarks;

    /**
     * 供应商编码
     */
    @ApiModelProperty("供应商编码")
    private String supplierBM;

    /**
     * 供应商名称
     */
    @ApiModelProperty("供应商名称")
    private String supplierName;
}
