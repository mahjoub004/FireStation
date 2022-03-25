package com.fireStation.repository;

import com.fireStation.model.Person;

import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class PersonRepository {

    private final DataHandler dataHandler;

    public PersonRepository(DataHandler dataHandler) {
        this.dataHandler = dataHandler;
    }

    public List<Person> findAllPersons() {

        return dataHandler.getData().getPersons();
    }
}
