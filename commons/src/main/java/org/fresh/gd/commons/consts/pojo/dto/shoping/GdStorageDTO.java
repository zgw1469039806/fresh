package org.fresh.gd.commons.consts.pojo.dto.shoping;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @DATA 2019/4/29 15:14
 * @Author 郭家恒
 * @Description TODO
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class GdStorageDTO {
    /**
     * 入库编号
     */
    private Integer storageid;

    /**
     * 进货ID
     */
    private Integer replenishId;

    /**
     * 入库时间
     */
    private Date storageTime;

    /**
     * 入库人员ID
     */
    private Integer storageuserid;

    /**
     * 进货单号
     */
    private String receiptNo;
}
