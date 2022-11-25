package com.stisla.springbootstarter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StislaController {

    @GetMapping("/blank")
    public String blank(Model model) {
        return "pages/blank";
    }

    @GetMapping("/credits")
    public String credits(Model model) {
        return "pages/credits";
    }
}
