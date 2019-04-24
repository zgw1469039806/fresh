package org.fresh.gd.unification.controller.order;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.order.GdOrderDTO;
import org.fresh.gd.unification.fegin.order.OrderFeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @DATA 2019/4/24 14:58
 * @Author 郭家恒
 * @Description TODO
 */
@RestController
@Slf4j
@RequestMapping("/unification")
@Api(description = "订单服务")
public class OrderController {
    @Autowired
    OrderFeginService orderFeginService;

    @PostMapping("/insertOrder")
    public ResponseData<Object> insertOrder(@RequestBody RequestData<GdOrderDTO> requestData) {
        orderFeginService.insertOrder(requestData);
        return null;
    }
}
