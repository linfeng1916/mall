package com.atguigu.gulimall.order.feign;

import com.atguigu.gulimall.order.vo.OrderItemVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


//告诉spring cloud 这个接口是一个远程客户端 调用远程服务
@FeignClient("gulimall-cart")//这个远程服务
public interface CartFeignService {

    @GetMapping("/currentUserItems")
    List<OrderItemVo> currentUserItems();
}
