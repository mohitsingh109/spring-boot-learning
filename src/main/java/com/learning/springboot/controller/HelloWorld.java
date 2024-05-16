package com.learning.springboot.controller;


import com.learning.springboot.service.HelloWorldService;
import com.learning.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // it's tell spring it's a rest endpoint class
public class HelloWorld {

    private UserService userService;

    private HelloWorldService helloWorldService;

    @Autowired
    public HelloWorld(UserService userService, HelloWorldService helloWorldService) {
        this.userService = userService;
        this.helloWorldService = helloWorldService;
    }

    @GetMapping("/hello")
    public String helloWord() {
        return "Hello World";
    }
}
