package com.devopsproject.devopspro;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("")
    public String hello() {
        return "DevOps Project - Sunny, Surya, Tarana, Ujjwal";
    }
}