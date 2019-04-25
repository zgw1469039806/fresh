package org.gw.shoping.controller;

import org.gw.shoping.rabbitmq.MQSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @DATA 2019-04-24 10:42
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@RestController
public class TestController {

    @Autowired
    MQSender mqSender;

//
//    @RequestMapping("/testMq")
//    public String testMq()
//    {
//        mqSender.send("000000000");
//        return "发送消息成功";
//    }
//
//
//
//    @RequestMapping("/testMq/topic")
//    public String topic()
//    {
//        mqSender.topicsend("000000000");
//        return "发送消息成功";
//    }
//
//
//    @RequestMapping("/testMq/fanout")
//    public String fanout()
//    {
//        mqSender.fanoutbinding1("000000000");
//        return "发送消息成功";
//    }
//
//
//
//    @RequestMapping("/testMq/header")
//    public String header()
//    {
//        mqSender.sendHeader("消息--------");
//        return "发送消息成功";
//    }


    /**
    * 功能描述 进入队列
    * @author zgw
    * @return java.lang.String
    */
    @RequestMapping("/Theteam")
    public String Theteam()
    {
        UserVo userVo=new UserVo();
        userVo.setUsername("张牟牟");
        userVo.setGoodsId(1);
        mqSender.Enoughtobuy(userVo);
        System.out.println("12331");
        return "排队中";
    }
}
