package com.zwy.sun.web.orders.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zwy.sun.service.IMemberService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (C), 2015-2019, 北京掌沃云视媒文化传媒有限公司
 * FileName: OrderController
 * Author:   SunSmile
 * Date:     2019/5/9 15:44
 * Description: 
 */
@RestController
public class OrderController {


    @Reference
    private IMemberService memberService;

    @GetMapping("getMember/{username}")
    public String getMember(@PathVariable("username") String username){
        return memberService.getMember(username);
    }
}