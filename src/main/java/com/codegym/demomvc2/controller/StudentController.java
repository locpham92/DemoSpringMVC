package com.codegym.demomvc2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/students")
public class StudentController {
    @GetMapping("/home")
    public ModelAndView showHome() {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("name","Hello");
        return modelAndView;
    }
    @GetMapping("/showPathVariable/{id}") //showPathVariable/1
    public ModelAndView showPathVariable(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("showPath");
        modelAndView.addObject("idStudent",id);
        return modelAndView;

    }
}
