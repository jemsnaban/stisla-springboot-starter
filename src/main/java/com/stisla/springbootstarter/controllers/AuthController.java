package com.stisla.springbootstarter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/auth-forgot-password")
    public String authForgotPassword(Model model) {
        return "pages/auth/auth-forgot-password";
    }

    @GetMapping("/auth-login")
    public String authLogin(Model model) {
        return "pages/auth/auth-login";
    }

    @GetMapping("/auth-register")
    public String authRegister(Model model) {
        return "pages/auth/auth-register";
    }

    @GetMapping("/auth-reset-password")
    public String authResetPassword(Model model) {
        return "pages/auth/auth-reset-password";
    }
}
