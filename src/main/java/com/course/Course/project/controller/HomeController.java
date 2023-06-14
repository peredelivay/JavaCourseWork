package com.course.Course.project.controller;


import jdk.jfr.Frequency;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home()
    {
        return "home";
    }

    @GetMapping("/contact")
    public String contact()
    {
        return "contact";
    }
}
