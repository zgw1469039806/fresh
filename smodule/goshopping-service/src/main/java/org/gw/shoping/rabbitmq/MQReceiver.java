//package org.gw.shoping.rabbitmq;
//
//import lombok.extern.slf4j.Slf4j;
//import org.fresh.gd.commons.consts.consts.Consts;
//import org.gw.shoping.controller.UserVo;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Service;
//
///**
// * @DATA 2019-04-24 10:29
// * @Author 张国伟  WeChat:17630376104
// * @Description 消息接收者
// */
//@Slf4j
//@Service
//public class MQReceiver
//{
//
//   @RabbitListener(queues = MQConfig.SHOP_QUEUE)
//   public void receive(String message)
//   {
//       System.err.println("------"+message);
//       UserVo userVo = Consts.stringToBean(message, UserVo.class);
//       System.out.println("userVo.getUsername() = " + userVo.getUsername());
//       //查询库存
//       //判断库存
//       //减库存下订单
//   }
//
//
//
////
////    @RabbitListener(queues = MQConfig.Queue)
////    public void receive(String message)
////    {
////      log.info("receive message:"+ message);
////    }
////
////    @RabbitListener(queues = MQConfig.Topic_Queue1)
////    public void topicreceive1(String message)
////    {
////      log.info("topic  queue1 msg"+message);
////    }
////    @RabbitListener(queues = MQConfig.Topic_Queue2)
////    public void topicreceive2(String message)
////    {
////        log.info("topic queue2 msg"+message);
////    }
////
////    @RabbitListener(queues = MQConfig.HEADER_QUEUE)
////    public  void receiveHeaderQueue(byte[] message)
////    {
////     log.info("header queue:------"+new String(message));
////    }
//}
