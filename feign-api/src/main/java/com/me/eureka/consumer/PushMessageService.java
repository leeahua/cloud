package com.me.eureka.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("autopai-iot-broker")
public interface PushMessageService {
    @RequestMapping(method = RequestMethod.GET,value = "/iot/push")
    String sendMessage(@RequestParam("name") String name);
}
