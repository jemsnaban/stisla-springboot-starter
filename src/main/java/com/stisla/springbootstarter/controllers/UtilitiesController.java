package com.stisla.springbootstarter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilitiesController {

    @GetMapping("/utilities-contact")
    public String utilitiesContact(Model model) {
        return "pages/utilities/utilities-contact";
    }

    @GetMapping("/utilities-invoice")
    public String utilitiesInvoice(Model model) {
        return "pages/utilities/utilities-invoice";
    }

    @GetMapping("/utilities-subscribe")
    public String utilitiesSubscribe(Model model) {
        return "pages/utilities/utilities-subscribe";
    }
}
