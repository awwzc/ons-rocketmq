package com.jerry.handler;


import com.jerry.mq.message.MQSendResult;
import com.jerry.notification.DemoMessage;
import com.jerry.notification.DemoParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author wuzq
 * @create 2018-04-12 上午12:00
 **/
@Component
@Slf4j
public class DemoMessageHandler implements DemoMessage {
    @Override
    public MQSendResult sendDynamicMessage(Map<String, Object> paramMap) {
        log.info("param:{}",paramMap);
        return new MQSendResult();
    }

    @Override
    public void sendBeanParamMessage(DemoParam param) {
        log.info("param:{}",param);
    }
}
