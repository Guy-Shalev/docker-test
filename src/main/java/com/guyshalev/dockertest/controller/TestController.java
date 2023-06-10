package com.guyshalev.dockertest.controller;


import com.guyshalev.dockertest.model.Person;
import com.guyshalev.dockertest.service.IPersonService;
import com.guyshalev.dockertest.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private ITestService testService;

    @Autowired
    private IPersonService personService;

    @GetMapping("/hello/{name}")
    public String getHello(@PathVariable("name") String name) {
        return testService.getHello(name);
    }

    @GetMapping("/getLastNme/{name}")
    public String getLastNme(@PathVariable("name") String name) {
        return personService.getLastNme(name);
    }

    @GetMapping("/names")
    public List<String> getNames() {
        return personService.getNames();
    }

    @PostMapping("/save")
    public void save(@RequestBody Person person) {
        personService.save(person);
    }
}
