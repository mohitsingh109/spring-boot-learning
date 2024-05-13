package com.learning.springboot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // it's tell spring it's a rest endpoint class
public class HelloWorld {

    @GetMapping("/hello")
    public String helloWord() {
        return "Hello World";
    }
}
