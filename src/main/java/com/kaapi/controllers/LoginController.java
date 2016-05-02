package com.kaapi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sheru on 02/05/16.
 */

@RestController
public class LoginController {

    @RequestMapping("/register")
    public String  registerUser(){
        return "You are registering, from now on Kaapi is always in your lips";
    }

    @RequestMapping("/login")
    public String  login() {
        return "You are logged in, thanks for drinking Kaapi";
    }

    @RequestMapping("/")
    public String  welcome(){
            return "Welcome to ooty nice to meet you";
    }
}
