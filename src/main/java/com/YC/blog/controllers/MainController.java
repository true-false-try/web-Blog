package com.YC.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class MainController {

    //We're processing to main list in my blog
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title","Main list");
        return "home";
    }



}
