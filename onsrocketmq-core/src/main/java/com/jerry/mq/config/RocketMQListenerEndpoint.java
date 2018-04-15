package com.jerry.mq.config;


import com.jerry.mq.core.RocketMQConsumer;

public interface RocketMQListenerEndpoint {

    String getId();

    String getTopic();

    void setConsumer(final RocketMQConsumer anConsumer);

    RocketMQConsumer getConsumer();

}
