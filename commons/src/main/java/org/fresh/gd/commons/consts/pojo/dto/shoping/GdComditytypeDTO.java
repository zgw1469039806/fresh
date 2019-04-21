package org.fresh.gd.commons.consts.pojo.dto.shoping;

import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseDataSource;

/**
 * @DATA 2019-04-21 14:38
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@ApiModel("商品类别")
@Data
public class GdComditytypeDTO {

    /**
     * 类型ID
     */
    @ApiModelProperty("类型ID")
    private Integer comditytypeId;

    /**
     * 类型名称
     */
    @ApiModelProperty("类型名称")
    private String typename;

    /**
     * 父级ID
     */
    @ApiModelProperty("父级ID")
    private Integer parent;

}
