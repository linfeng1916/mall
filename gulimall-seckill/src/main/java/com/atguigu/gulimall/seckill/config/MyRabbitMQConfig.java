package com.atguigu.gulimall.seckill.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//开启RabbitMQ消息队列 不监听消息可以不加
//@EnableRabbit
@Configuration
public class MyRabbitMQConfig {

//    序列化机制
    @Bean
    public MessageConverter messageConverter() {

        return new Jackson2JsonMessageConverter();
    }
}
