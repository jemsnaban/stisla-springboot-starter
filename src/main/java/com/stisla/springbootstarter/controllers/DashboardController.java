package com.stisla.springbootstarter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/index")
    public String home(Model model) {

        return "pages/dashboard/index";
    }

    @GetMapping("/general")
    public String general(Model model) {

        return "pages/dashboard/index-0";
    }
}
