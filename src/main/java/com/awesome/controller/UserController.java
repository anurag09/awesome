package com.awesome.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@PreAuthorize("hasAuthority('USER')")
public class UserController {

    @RequestMapping("")
    public String home(){
        return "Hello :: This is user home";
    }
}
