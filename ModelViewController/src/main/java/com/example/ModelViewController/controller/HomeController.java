package com.example.ModelViewController.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String print() {
        return "Naim";
    }
    @RequestMapping("/about")
    public String about(){
        return "About";
    }
}
