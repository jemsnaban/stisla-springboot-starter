package com.stisla.springbootstarter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormsController {

    @GetMapping("/forms-advanced-form")
    public String formsAdvancedForm(Model model) {
        return "pages/forms/forms-advanced-form";
    }

    @GetMapping("/forms-editor")
    public String formsEditor(Model model) {
        return "pages/forms/forms-editor";
    }

    @GetMapping("/forms-validation")
    public String formsValidation(Model model) {
        return "pages/forms/forms-validation";
    }
}
