package com.learning.springboot.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service // please create a object/bean of this class
public class UserService {

    public List<String> fetchAllUser() {



        List<String> name = new ArrayList<>();
        name.add("Mohit");
        name.add("Karan");
        return name;
    }
}
