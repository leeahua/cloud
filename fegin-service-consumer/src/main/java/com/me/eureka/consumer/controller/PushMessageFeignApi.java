package com.me.eureka.consumer.controller;

import com.wtcar.mqtt.json.iotway.PushMesageRequest;
import com.wtcar.mqtt.json.iotway.PushMesageResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(value = "autopai-iot-broker")
public interface PushMessageFeignApi {

    @RequestMapping(method = RequestMethod.POST,value = "/iot/down/message/push")
    PushMesageResponse sendMessage(@RequestBody PushMesageRequest pushMesageRequest);
}

