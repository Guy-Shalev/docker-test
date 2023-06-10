package com.guyshalev.dockertest.dal;

import com.guyshalev.dockertest.model.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonDAL extends JpaRepository<PersonEntity, Long> {

    PersonEntity findByFirstName(String firstName);

}
