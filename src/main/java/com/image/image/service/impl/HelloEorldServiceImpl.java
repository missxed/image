package com.image.image.service.impl;

import com.image.image.service.HelloWorldService;
import org.springframework.stereotype.Service;

@Service
public class HelloEorldServiceImpl implements HelloWorldService {
    @Override
    public String getHelloWorld() {
        return "Hello World ！！";
    }
}
