package com.tyj.itoken.spring.cloud.web.admin.feign.controller;

import com.tyj.itoken.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.awt.SunHints;

@RestController
public class WebAdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "user",method = RequestMethod.GET)
    public String queryUserName(String userName){
       return adminService.queryUserName(userName);
    }
}
