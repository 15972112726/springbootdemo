package com.example.demo.controller;

import com.example.demo.bo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by dell on 2018/5/4.
 */
@Controller
@RequestMapping("fastjson")
public class FastJsonController {

    @RequestMapping("/test")
    @ResponseBody
    public User test(){
        User user = new User();
        user.setId(1);
        user.setUsername("jack");
        user.setPassword("jack123");
        user.setBirthday(new Date());

        return user;
    }
}
