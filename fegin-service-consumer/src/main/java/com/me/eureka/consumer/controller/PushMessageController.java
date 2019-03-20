package com.me.eureka.consumer.controller;

import com.wtcar.mqtt.json.iotway.PushMesageRequest;
import com.wtcar.mqtt.json.iotway.PushMesageResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PushMessageController {

   @Autowired
    private PushMessageFeignApi pushMessageFeignApi;


    @RequestMapping(value = "/iot/send",method = RequestMethod.GET)
    String sendMessge(@RequestParam("name") String name){
        PushMesageRequest request = new PushMesageRequest();
        request.setSystemId("user");
        request.setPacakgeName("com.iot.deng");
        request.setData(name);
        request.setSn("s19898989");
        request.setCarModelId("S302");
        PushMesageResponse pushMesageResponse = pushMessageFeignApi.sendMessage(request);
        log.info(pushMesageResponse.toRuleString());
        return pushMesageResponse.toRuleString();
    }
}
