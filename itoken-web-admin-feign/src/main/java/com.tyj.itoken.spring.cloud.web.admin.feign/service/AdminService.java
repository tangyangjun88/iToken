package com.tyj.itoken.spring.cloud.web.admin.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "itoken-spring-cloud-service-admin" ,fallback = AdminServiceImpl.class)
@Component
public interface AdminService {
        @RequestMapping(value = "user",method = RequestMethod.GET)
        public String queryUserName(@RequestParam(value = "userName")String userName);
}
