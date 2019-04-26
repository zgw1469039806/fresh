package org.fresh.gd.commons.consts.pojo.dto.shoping;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @DATA 2019-04-26 16:30
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@ApiModel("货品详情返回信息")
@Data
public class GdinventoryallDTO {
    /**
     * 商品ID
     */
    @TableId("comdityId")
    private Integer comdityId;

    /**
     * 是否打折;0为false,2为true
     */
    private Integer isnodiscount;

    /**
     * 库存数量
     */
    private Integer stock;

    /**
     * 对应积分
     */
    private String corresponding;

    /**
     * 所属店铺ID
     */
    private Integer storeid;

    /**
     * 所属店铺名称
     */
    private String storeName;



    /**
     * 商品名称
     */
    private String comdityname;

    /**
     * 商品类别
     */
    @TableField("comditytypeId")
    private Integer comditytypeId;

    /**
     * 商品单位
     */
    private String comditydw;

    /**
     * 商品描述
     */
    private String comditydescribe;

    /**
     * 商品单价
     */
    private String comdityprice;

    /**
     * 类型名称
     */
    private String typename;

    /**
     * 父级ID
     */
    private Integer parent;


}
