package com.controller;

/**
 * @program: springtest
 * @description:
 * @author: vic
 * @create: 2019-05-20 16:49
 **/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsulApp {

    @RequestMapping("/home")
    public Object home() {
        System.out.println("1111111111111");
        return "OK11";
    }

}