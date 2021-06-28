package com.atguigu.gulimall.order.listener;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.atguigu.gulimall.order.service.OrderService;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;


@Service
@RabbitListener(queues = "order.release.order.queue")
public class OrderCloseListener {

//    @Autowired
//    AlipayTemplate alipayTemplate;

    @Autowired
    OrderService orderService;

    @RabbitHandler
    public void listening(OrderEntity entity, Channel channel, Message message) throws IOException {

        System.out.println("收到过期的订单，准备关闭订单。orderID:" + entity.getId() + "; orderSn:" + entity.getOrderSn());
        try {
            orderService.closeOrder(entity);
            //手动调用支付宝收单 p310 暂时不用手动  回复消息 收到了。
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
        } catch (IOException e) {
            //true 重新回到消息队列
            channel.basicReject(message.getMessageProperties().getDeliveryTag(), true);
        }
    }
}
