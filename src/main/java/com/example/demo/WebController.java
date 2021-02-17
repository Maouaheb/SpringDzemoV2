package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Controller
public class WebController implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/").setViewName("form");
        registry.addViewController("/results").setViewName("results");

    }
    @GetMapping("/")
    public String ShowForm(PersonForm personForm){
        return "form";
    }
    @PostMapping("/")
    public String checkForm(PersonForm personForm){
        return "redirect:/results";
    }
}
