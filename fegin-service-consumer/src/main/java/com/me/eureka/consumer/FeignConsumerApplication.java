package com.me.eureka.consumer;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

import javax.annotation.Resource;

@EnableHystrix
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com"})
public class FeignConsumerApplication implements CommandLineRunner {




    public static void main(String[] args) {
        SpringApplication.run(FeignConsumerApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {

        System.out.println("11111");
    }
}
