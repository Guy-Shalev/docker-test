package com.guyshalev.dockertest.service;

import com.guyshalev.dockertest.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IPersonService {

    String getLastNme(String name);

    void save(Person person);

    List<String> getNames();
}
