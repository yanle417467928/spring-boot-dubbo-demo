package com.yanle.springboot.dubbo.demo.consumer;

import com.yanle.springboot.dubbo.demo.service.OrderService;
import com.yanle.springboot.dubbo.demo.service.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Reference(version = "${demo.service.version}")
    private TestService testService;
    @Reference(version = "${demo.service.version}")
    private OrderService orderService;

    @GetMapping(value = "/hello")
    public String hello() {
        return testService.test();
    }
}
