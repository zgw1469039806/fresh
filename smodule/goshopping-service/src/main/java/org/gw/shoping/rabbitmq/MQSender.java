package org.gw.shoping.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.fresh.gd.commons.consts.consts.Consts;
import org.gw.shoping.controller.UserVo;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @DATA 2019-04-24 10:29
 * @Author 张国伟  WeChat:17630376104
 * @Description  消息发送者
 */
@Slf4j
@Service
public class MQSender {

    @Autowired
    AmqpTemplate amqpTemplate;
//
    public void send(Object message)
    {
        String msg= message.toString();
        log.info("send message:"+msg );
        amqpTemplate.convertAndSend(MQConfig.Queue,msg);
    }
//
//
//    public void topicsend(Object message)
//    {
//        String msg= message.toString();
//        log.info("send message:"+msg);
//        amqpTemplate.convertAndSend(MQConfig.TOPICEXCHANGE,"topic.key1",msg+"1");
//        amqpTemplate.convertAndSend(MQConfig.TOPICEXCHANGE,"topic.key2",msg+"");
//    }
//
//    public void fanoutbinding1(Object message)
//    {
//        String msg= message.toString();
//        log.info("send fanoutbinding1 message:"+msg );
//        amqpTemplate.convertAndSend(MQConfig.FANOUTEXCHANGE,"",msg+"1");
//    }
//
//    public void sendHeader(Object message)
//    {
//        String msg= message.toString();
//        log.info("send fanoutbinding1 message:"+msg );
//        MessageProperties messageProperties=new MessageProperties();
//        messageProperties.setHeader("header1","value1");
//        messageProperties.setHeader("header2","value2");
//        Message obj=new Message(msg.getBytes(),messageProperties);
//        amqpTemplate.convertAndSend(MQConfig.HEADER_EXCHANGE,msg);
//    }

    public void Enoughtobuy(UserVo userVo) {
        String msg= Consts.beanToString(userVo);
        log.info("user:----"+msg);
        amqpTemplate.convertAndSend(MQConfig.SHOP_QUEUE,msg);
    }
}
