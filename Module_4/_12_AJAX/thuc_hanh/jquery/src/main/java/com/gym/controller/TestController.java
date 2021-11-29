package com.gym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller(value = "")
public class TestController {

    @GetMapping(value = "/home")
    public String home(){
        return "home";
    }

    @GetMapping(value = "/home1")
    public String home1(){
        return "home1";
    }
}
