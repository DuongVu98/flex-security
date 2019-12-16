package com.hcmiuiot.MicroSec.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/test")
    public String testPage(){
        return "test";
    }

    @GetMapping("/error")
    public String errorPage(){
        return "error";
    }

    @GetMapping("/")
    public String getHomePage(){
        return "home";
    }

    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    }
}
