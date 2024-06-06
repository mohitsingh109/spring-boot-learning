package com.learning.springboot.controller;

import com.learning.springboot.model.Person;
import com.learning.springboot.model.PersonDTO;
import com.learning.springboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    private final PersonService personService;

    @Autowired // Optional
    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @PostMapping("/person/save")
    public void savePerson(@RequestBody Person person) {
        personService.save(person);
    }

    @GetMapping("/person/{id}")
    public PersonDTO fetchById(@PathVariable("id") Long id) {
        return personService.fetchById(id);
    }
}
