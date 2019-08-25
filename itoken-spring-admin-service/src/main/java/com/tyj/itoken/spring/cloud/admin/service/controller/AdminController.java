package com.tyj.itoken.spring.cloud.admin.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "user",method = RequestMethod.GET)
    public String queryUserName(String userName){
        return "你获取的姓名是："+userName;
    }
}
