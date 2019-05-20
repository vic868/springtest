package com.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {


    @RequestMapping("/sayhello")
    public String sayHi(){

        return "hello";
    }
}
