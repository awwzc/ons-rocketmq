package com.jerry.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * ${DESCRIPTION}
 *
 * @author wuzq
 * @create 2018-04-11 上午8:09
 **/
public class MqConfig {
    @Value("${rocket.mq.namesrvAddr}")
    private String namesrvAddr;
    @Value("${rocket.mq.producerGroupName}")
    private String producerGroupName;
    @Value("${rocket.mq.defaultSerializeType}")
    private String defaultSerializeType;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
