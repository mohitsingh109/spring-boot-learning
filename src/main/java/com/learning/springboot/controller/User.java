package com.learning.springboot.controller;


import com.learning.springboot.service.HelloWorldService;
import com.learning.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController // creating a bean/object
@RequestMapping("/user")
public class User {

    private UserService userService;

    @Autowired
    private HelloWorldService helloWorldService;

    @Autowired // dependency injection
    public User(UserService userService) { // Object/Bean is not create
        this.userService = userService;
    }

    @GetMapping("/list") // Get Request
    public List<String> fetchAllUser() {
        return userService.fetchAllUser();
    }

    @GetMapping("/{id}")
    public String fetUserById(@PathVariable("id") String id) {
        System.out.println(id);
        return "Karan";
    }

    @GetMapping("/document/d/{token}/edit")
    public String test(@PathVariable("token") String token) {
        System.out.println(token);
        return "It's working";
    }

    @GetMapping("/params")
    public String testParams(@RequestParam("token") String token, @RequestParam("name") String name) {
        System.out.println(token);
        System.out.println(name);
        return "Working";
    }
}

/*
  1000
  10 API Response

  offset=11

 */