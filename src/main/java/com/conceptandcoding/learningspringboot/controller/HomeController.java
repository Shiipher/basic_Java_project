package com.conceptandcoding.learningspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    @ResponseBody
    public String greet(){
        return "Hello World";
    }
    @RequestMapping("/about")
    public String about(){
        return "we dont teach we educate";
    }

}
