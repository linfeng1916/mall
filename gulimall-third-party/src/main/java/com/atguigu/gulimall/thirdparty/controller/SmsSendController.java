package com.atguigu.gulimall.thirdparty.controller;

import com.atguigu.common.utils.R;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


//这里要返回json数据
@RestController
//基准路径
@RequestMapping("/sms")
public class SmsSendController {

//    @Autowired
//    SmsComponent smsComponent;
//
//    /**
//     * 提供给别的服务调用的
//     */
//    @GetMapping("/sendcode")
//    public R sendCode(@RequestParam("phone") String phone, @RequestParam("code") String code) {
//
//        smsComponent.sendSmsCode(phone, code);
//
//        return R.ok();
//    }

}
