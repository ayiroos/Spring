package com.springapp.dao;

import com.springapp.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {

    int insertPerson(UUID id, Person person);

    default int addPerson(Person person) {

        UUID id =UUID.randomUUID();
        return insertPerson(id,person);

    }

    List<Person> getAllPeople();

    Optional<Person> getPersonById (UUID id);

    int deletePersonById (UUID id);

    int updatePersonById (UUID id,Person person);

}
