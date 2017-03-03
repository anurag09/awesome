package com.awesome.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MyController {

    @RequestMapping(value = "/user/id", method = RequestMethod.GET)
    public String login(){
        // username and password
        return "success";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String create(){
        // username and password
        return "success";
    }
}
