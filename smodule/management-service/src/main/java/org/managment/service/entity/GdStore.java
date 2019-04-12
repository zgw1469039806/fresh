package org.managment.service.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 店铺表
 * </p>
 *
 * @author guowei.zhang
 * @since 2019-04-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class GdStore implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 店铺ID
     */
    private Integer storeid;

    /**
     * 店铺名称
     */
    private String storename;

    /**
     * 店铺地址
     */
    private String storeaddress;


}
