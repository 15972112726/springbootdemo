package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dell on 2018/5/7.
 */
@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping("/test")
    public String test(){
    return "test";
    }
}
