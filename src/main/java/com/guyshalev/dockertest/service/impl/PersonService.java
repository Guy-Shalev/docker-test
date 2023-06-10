package com.guyshalev.dockertest.service.impl;

import com.guyshalev.dockertest.dal.IPersonDAL;
import com.guyshalev.dockertest.model.Person;
import com.guyshalev.dockertest.model.entity.PersonEntity;
import com.guyshalev.dockertest.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService implements IPersonService {

    @Autowired
    private IPersonDAL personDAL;

    @Override
    public String getLastNme(String firstName) {
        return personDAL.findByFirstName(firstName).getLastName();
    }

    @Override
    public void save(Person person) {
        personDAL.save(new PersonEntity(person.getFirstName(), person.getLastName()));
    }

    @Override
    public List<String> getNames() {
        return personDAL.findAll().stream()
                .map(person -> person.getFirstName() + " " + person.getLastName())
                .collect(Collectors.toList());

    }
}
