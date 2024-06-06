package com.learning.springboot.service;

import com.learning.springboot.model.Person;
import com.learning.springboot.model.PersonDTO;
import com.learning.springboot.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;


    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void save(Person person) {
        personRepository.save(person);
    }

    public List<Person> findAll() {
        return personRepository.findAll(); //
    }

    public PersonDTO fetchById(Long id) {
        return personRepository.fetchById(id);
    }
}
