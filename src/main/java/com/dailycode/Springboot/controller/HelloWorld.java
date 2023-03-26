package com.dailycode.Springboot.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @Value("${welcome.message}")
    private String welcomeMessage;




    @GetMapping("/")
    public String helloWorld(){
        return welcomeMessage;

    }

}
