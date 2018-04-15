package com.jerry;


import com.jerry.mq.annotation.AsyncMQ;
import com.jerry.mq.annotation.EnableAsyncMQ;
import com.jerry.mq.core.RocketMQConsumer;
import com.jerry.mq.core.RocketMQProducer;
import com.jerry.mq.serialize.SerializerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@SpringBootApplication
@ComponentScan(basePackages={"com.jerry"},
		excludeFilters={@ComponentScan.Filter(type= FilterType.ANNOTATION,value=AsyncMQ.class),
				@ComponentScan.Filter(type= FilterType.ANNOTATION,value=EnableAsyncMQ.class)})
public class MqConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MqConsumerApplication.class, args);
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		PropertySourcesPlaceholderConfigurer p = new PropertySourcesPlaceholderConfigurer();
		p.setIgnoreUnresolvablePlaceholders(true);
		return p;
	}

	@Bean
	public RocketMQProducer producer(@Value("${rocket.mq.namesrvAddr}")String namesrvAddr, @Value("${rocket.mq.producerGroupName}")String producerGroupName){
		RocketMQProducer producer = new RocketMQProducer();
		producer.setNamesrvAddr(namesrvAddr);
		producer.setProducerGroupName(producerGroupName);
		return producer;
	}

	@Bean
	public RocketMQConsumer demoMQConsumer(@Value("${rocket.mq.namesrvAddr}")String namesrvAddr, @Value("${rocket.mq.consumerGroupName}")String consumerGroupName){
		RocketMQConsumer consumer = new RocketMQConsumer();
		consumer.setNamesrvAddr(namesrvAddr);
		consumer.setConsumerGroupName(consumerGroupName);
		return consumer;
	}
	@Bean
	public SerializerFactory serializerFactory(@Value("${rocket.mq.defaultSerializeType}")String defaultSerializeType){
		SerializerFactory serializerFactory = new SerializerFactory();
		SerializerFactory.setDefaultSerializeType(defaultSerializeType);
		return serializerFactory;
	}

}
