package com.yanle.springboot.dubbo.demo.service.impl;

import com.yanle.springboot.dubbo.demo.service.OrderService;
import com.yanle.springboot.dubbo.demo.service.TestService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service(version = "${demo.service.version}")
public class TestServiceImpl implements TestService {
    public String test() {
        return "hello world";
    }
}
