package com.yanle.springboot.dubbo.demo.service.impl;

import com.yanle.springboot.dubbo.demo.service.OrderService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service(version = "${demo.service.version}")
public class OrderServiceImpl implements OrderService {
    public String sayHello(String name) {
        return null;
    }
}
