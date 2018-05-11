package com.awesome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping
public class MyController {

    @RequestMapping(value = "/anurag", method = RequestMethod.GET)
    public String create(){
        // username and password
        return "car";
    }


}
