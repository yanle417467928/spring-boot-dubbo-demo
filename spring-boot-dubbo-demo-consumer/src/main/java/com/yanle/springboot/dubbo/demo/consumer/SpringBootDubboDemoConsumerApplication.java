package com.yanle.springboot.dubbo.demo.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class SpringBootDubboDemoConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDubboDemoConsumerApplication.class, args);
    }

}
