package com.me.eureka.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@FeignClient("eureka-service")用于表服务提供方
@FeignClient("eureka-service")
public interface DemoService {

    @RequestMapping(method = RequestMethod.GET,value = "/hello")
    String hello();


}
