package com.me.eureka.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@FeignClient("eureka-service")用于表服务提供方
@FeignClient("autopai-iot-broker")
public interface DemoService {
    @RequestMapping(method = RequestMethod.GET,value = "/iot/hello")
    String hello();
}
