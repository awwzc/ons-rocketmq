package com.jerry.service;


import com.jerry.mq.message.MQSendResult;
import com.jerry.notification.DemoMessage;
import com.jerry.notification.DemoParam;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author wuzq
 * @create 2018-04-11 上午7:54
 **/
@Service
public class DemoService {
    @Value("${rocket.mq.namesrvAddr}")
    private String namesrvAddr;

    @Resource
    private DemoMessage message;

    public MQSendResult sendMessage(){
        Map<String,Object> param = new HashMap<>();
        param.put("name","wzq");
        MQSendResult result =  message.sendDynamicMessage(param);
        return result;
    }

    public void sendBeanMessage(){
        DemoParam param = new DemoParam();
        param.setId(1L);
        param.setAge(29);
        param.setBirth(new Date());
        param.setMoney(new BigDecimal(34.567));
        param.setName("搬砖打杂");
        message.sendBeanParamMessage(param);

    }

}
