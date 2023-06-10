package com.guyshalev.dockertest.service.impl;

import com.guyshalev.dockertest.service.ITestService;
import org.springframework.stereotype.Service;

@Service
public class TestService implements ITestService {

    @Override
    public String getHello(String name) {
        return "Hello " + name;
    }

}
