package com.awesome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ekansh
 * @since 30/3/16
 */
@Controller
@RequestMapping({"","/"})
public class HomeController {

    @RequestMapping("")
    public String home(){

        return "welcome";
    }

}
