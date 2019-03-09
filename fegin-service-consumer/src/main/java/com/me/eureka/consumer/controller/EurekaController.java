package com.me.eureka.consumer.controller;

import com.me.eureka.consumer.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaController {
    @Autowired
    private DemoService demoService;

    @RequestMapping("/hello")
    public String hello(){
        return demoService.hello();
    }

}
