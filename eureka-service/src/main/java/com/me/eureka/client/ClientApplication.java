package com.me.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class ClientApplication {

    @RequestMapping("/hello")
    public String hello(){
        return "success!";
    }
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

}
