package com.jerry.config;


import com.jerry.mq.core.RocketMQProducer;
import com.jerry.mq.serialize.SerializerFactory;
import com.jerry.mq.support.MQInterfaceScannerConfigurer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

/**
 * ${DESCRIPTION}
 *
 * @author wuzq
 * @create 2018-04-10 下午11:38
 **/
public class MqConfiguration {
    @Value("${rocket.mq.namesrvAddr}")
    private String namesrvAddr;
    @Value("${rocket.mq.producerGroupName}")
    private String producerGroupName;
    @Value("${rocket.mq.defaultSerializeType}")
    private String defaultSerializeType;
    @Bean
    public RocketMQProducer producer(){

        RocketMQProducer producer = new RocketMQProducer();
        producer.setNamesrvAddr(namesrvAddr);
        producer.setProducerGroupName(producerGroupName);
        return producer;
    }
    @Bean
    public SerializerFactory serializerFactory(){
        SerializerFactory serializerFactory = new SerializerFactory();
        SerializerFactory.setDefaultSerializeType(defaultSerializeType);
        return serializerFactory;
    }
    @Bean
    public MQInterfaceScannerConfigurer beanScannerConfigurer(){
        MQInterfaceScannerConfigurer beanScannerConfigurer = new MQInterfaceScannerConfigurer();
        beanScannerConfigurer.setProducerBeanName("producer");
        beanScannerConfigurer.setBasePackage("com.sk.mq.notification");
        return beanScannerConfigurer;
    }


}
