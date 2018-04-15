package com.jerry.mq.core;


import com.jerry.mq.message.MQSendResult;
import com.jerry.mq.message.MessageBean;

/**
 * Created by samfan on 2017-08-29.
 */
public interface MQProducer {

    /**
     *
     * @param messageBean
     * @return
     * @throws Exception
     */
    MQSendResult send(MessageBean messageBean) throws Exception;

    /**
     *
     * @param messageBean
     * @throws Exception
     */
    void sendAsync(MessageBean messageBean) throws Exception;

    /**
     *
     * @param messageBean
     * @param shardingKey
     * @return
     * @throws Exception
     */
    MQSendResult sendOrderMessage(MessageBean messageBean, Object shardingKey) throws Exception;
}
