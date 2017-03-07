package com.awesome.controller;

import com.awesome.beans.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by amm0924 on 3/7/17.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public String getLogin(Model model){
        model.addAttribute("user", new User());
        return "login";
    }
}
