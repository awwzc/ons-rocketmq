package com.jerry.notification;




import com.jerry.mq.annotation.AsyncMQ;
import com.jerry.mq.message.MQSendResult;


import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author wuzq
 * @create 2018-04-11 上午7:36
 **/
public interface DemoMessage {


    /**
     * 发送用户动态
     * @param paramMap
     */
    @AsyncMQ(topic = "${topic.txxy.notification}", tags = "${topic.txxy.notification.send.dynamic.message}", consumer = "demoMQConsumer")
    MQSendResult sendDynamicMessage(Map<String, Object> paramMap);

    @AsyncMQ(topic = "${topic.txxy.notification}", tags = "${topic.txxy.notification.send.dynamic.bean}", consumer = "demoMQConsumer")
    void sendBeanParamMessage(DemoParam param);
}
