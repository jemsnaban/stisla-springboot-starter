package com.stisla.springbootstarter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LayoutController {

    @GetMapping("/layout-default")
    public String layoutDefault(Model model) {
        return "pages/layout/layout-default";
    }

    @GetMapping("/layout-transparent")
    public String layoutTransparent(Model model) {
        return "pages/layout/layout-transparent";
    }

    @GetMapping("/layout-top-navigation")
    public String layoutTopNavigation(Model model) {
        return "pages/layout/layout-top-navigation";
    }
}
