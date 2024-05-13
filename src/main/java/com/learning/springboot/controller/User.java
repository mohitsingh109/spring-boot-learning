package com.learning.springboot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class User {


    @GetMapping("/user/list") // Get Request
    public List<String> fetchAllUser() {
        List<String> name = new ArrayList<>(); //Run time poly..
        name.add("Mohit");
        name.add("Karan");
        return name;
    }
}
