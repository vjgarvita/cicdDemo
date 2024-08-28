package com.garvita.cicd_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoRestController {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello world!";
    }
}