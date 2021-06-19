package com.atguigu.gulimall.order.vo;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;


@ToString
@Data
public class OrderSubmitVo {

    private Long addrId;
    //支付方式
    private Integer payType;

    //无需提交购买的商品，去购物车在获取一遍 需要重新计算

    //优惠、发票....

    //防重令牌
    private String orderToken;

    //应付价格 校验价格
    BigDecimal payPrice;

    //订单备注 要不要辣的
    private String node;

    //用户相关信息，直接去session取出登录用户
}
