package com.example.eightballpool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/stats")
    public String stats(){
        return "stats";
    }

    @GetMapping("/merchandise")
    public String merchandise(){
        return "merchandise";
    }
    @GetMapping("/Matches")
    public String matches(){
        return "matches";
    }

    @GetMapping("/competitions")
    public String competitions(){
        return "competitions";
    }


}
