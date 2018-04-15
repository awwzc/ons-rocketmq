package com.jerry.controller;



import com.jerry.mq.message.MQSendResult;
import com.jerry.service.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ${DESCRIPTION}
 *
 * @author wuzq
 * @create 2018-04-11 上午7:59
 **/
@RestController
public class DemoController {
    @Autowired
    private DemoService service;
    @PostMapping("/send")
    public MQSendResult sendMessage(){
        return service.sendMessage();
    }

    @PostMapping("/sendbean")
    public void sendBeanMessage(){
         service.sendBeanMessage();
    }
}
