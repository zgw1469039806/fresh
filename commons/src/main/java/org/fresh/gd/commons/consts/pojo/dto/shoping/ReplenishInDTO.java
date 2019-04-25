package org.fresh.gd.commons.consts.pojo.dto.shoping;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @DATA 2019-04-24 09:03
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@ApiModel("综合查询进货条件")
@Data
public class ReplenishInDTO {

   @ApiModelProperty("进货编号")
   private Integer receiptNo;
   @ApiModelProperty("开始时间")
      private String startTime;
   @ApiModelProperty("结束时间")
   private String endTime;
}
