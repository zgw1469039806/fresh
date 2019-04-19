package org.fresh.gd.commons.consts.pojo.dto.oauth;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @DATA 2019-04-19 17:06
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@Data
@ApiModel("权限")
public class GdPositionDTO {

    /**
     * 用户ID
     */
    @ApiModelProperty("用户ID")
    private Integer userId;

    /**
     * 角色名称
     */
    @ApiModelProperty("角色名称")
    private String pname;

}
