package com.tutorial.ansible.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String welcome()
    {
        return "do not worry i am running";
    }
}
