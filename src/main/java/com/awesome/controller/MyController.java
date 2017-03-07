package com.awesome.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MyController {

    @RequestMapping(value = "/anurag", method = RequestMethod.POST)
    public String create(){
        // username and password
        return "success";
    }


}
