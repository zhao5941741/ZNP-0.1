package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {

    @Value("${aaa}")
    public String aaa;

    @RequestMapping("/test")
    public String test() {
        return aaa;
    }
}
