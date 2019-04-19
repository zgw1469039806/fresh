package org.fresh.gd.commons.consts.pojo.dto.management;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @DATA 2019-04-12 10:31
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@ApiModel("门店信息数据模型")
@Data
public class GdStoreDTO {

    @ApiModelProperty("店铺ID")
    private Integer storeid;


    @ApiModelProperty("店铺名称")
    private String storename;


    @ApiModelProperty("店铺地址")
    private String storeaddress;

    @ApiModelProperty("图片链接")
    private String storeImagesUri;

    private List<ManageStoreDTO> manageStoreDTOList;


}
