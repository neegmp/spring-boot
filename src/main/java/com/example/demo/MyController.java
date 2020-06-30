package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class MyController {

    @RequestMapping("/test")
    public String testApp(){
        return "App is running : " + new Date();
    }
}
