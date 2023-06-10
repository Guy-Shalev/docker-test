package com.guyshalev.dockertest.service;

import org.springframework.stereotype.Service;

@Service
public interface ITestService {

    String getHello(String name);
}
