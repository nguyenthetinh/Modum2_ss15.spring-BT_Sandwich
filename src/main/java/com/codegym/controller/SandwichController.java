package com.codegym.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {

    @GetMapping
    public String sandwich(){
        return "index";
    }

    @PostMapping("/list")
    public String finish(@RequestParam String condiment , Model model){
        model.addAttribute("input",condiment);
        return "finish";
    }
}
