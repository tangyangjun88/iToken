package com.tyj.itoken.spring.cloud.web.admin.feign.service;

import org.springframework.stereotype.Component;

@Component
public class AdminServiceImpl implements AdminService {
    @Override
    public String queryUserName(String userName) {
        return "你获取的名字是："+userName+"，但是服务器正忙，请稍后重试";
    }
}
