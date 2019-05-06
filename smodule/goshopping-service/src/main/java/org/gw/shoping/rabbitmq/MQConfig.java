package org.gw.shoping.rabbitmq;

import com.rabbitmq.client.AMQP;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @DATA 2019-04-24 10:30
 * @Author 张国伟  WeChat:17630376104
 * @Description 消息配置
 */
@Configuration
public class MQConfig {
    public static final String SHOP_QUEUE="shop.queue";
    public static final String Queue="queue";
    public static final String HEADER_QUEUE="herder.queue";
    public static final String Topic_Queue1="topic.queue1";
    public static final String Topic_Queue2="topic.queue2";
    public static final String TOPICEXCHANGE="topicexchange";
    public static final String FANOUTEXCHANGE="fanoutExchange";
    public static final String HEADER_EXCHANGE="HeadersExchange";
    /**
     * 功能描述
     * Decect 模式 交换机
     * @param
     * @return java.lang.String
     * @author zgw
     */
    @Bean
    public Queue queue()
    {
        return new Queue(Queue,true);
    }

    @Bean
    public Queue shopqueue()
    {
        return new Queue(SHOP_QUEUE,true);
    }

    @Bean
    public Queue Tocpicqueue1()
    {
        return new Queue(Topic_Queue1,true);
    }

    @Bean
    public Queue Topicqueue2()
    {
        return new Queue(Topic_Queue2 ,true);
    }

   /**
   * 功能描述
    * 通配符交换机
   * @author zgw
   * @param
   * @return org.springframework.amqp.core.TopicExchange
   */
    @Bean
    public TopicExchange topicExchange()
    {
        return new TopicExchange(TOPICEXCHANGE);
    }

    /**
    * 功能描述
     *
     * 消息绑定交换机
    * @author zgw
    * @param
    * @return org.springframework.amqp.core.Binding
    */
    @Bean
    public Binding topicbinding1()
    {
     return BindingBuilder.bind(Tocpicqueue1()).to(topicExchange()).with("topic.key1");
    }


    @Bean
    public Binding topicbinding2()
    {
        return BindingBuilder.bind(Tocpicqueue1()).to(topicExchange()).with("topic.#");
    }

    /**
    * 功能描述
     *
     * Fanout 广播模式
    * @author zgw
    * @param
    * @return org.springframework.amqp.core.FanoutExchange
    */
    @Bean
    public FanoutExchange fanoutExchange()
    {
      return new FanoutExchange(FANOUTEXCHANGE);
    }

    /**
    * 功能描述
     * 绑定广播
    * @author zgw
    * @param
    * @return org.springframework.amqp.core.Binding
    */
    @Bean
    public Binding fanoutbinding1()
    {
        return BindingBuilder.bind(Tocpicqueue1()).to(fanoutExchange());
    }


    @Bean
    public Binding fanoutbinding2()
    {
        return BindingBuilder.bind(Tocpicqueue1()).to(fanoutExchange());
    }


//    /**
//    * 功能描述
//     * header模式  交换机
//    * @author zgw
//    * @param
//    * @return org.springframework.amqp.core.HeadersExchange
//    */
//    @Bean
//    public HeadersExchange headersExchange()
//    {
//        return new HeadersExchange(HEADER_EXCHANGE);
//    }
//    public Queue headerQueue1()
//    {
//        return new Queue(HEADER_QUEUE);
//    }
//
//    @Bean
//    public Binding herderding()
//    {
//        Map<String,Object> map=new HashMap<>();
//        map.put("header1","value1");
//        map.put("header2","value2");
//        return BindingBuilder.bind(headerQueue1()).to(headersExchange()).whereAll(map).match();
//    }

}
