package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dell on 2018/5/4.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello,this is a springboot demo";
    }

    @RequestMapping("/hello2")
    public String hello2(){
        return "hello2,this is a springboot demo";
    }
}
