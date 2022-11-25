package com.stisla.springbootstarter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ComponentsController {

    @GetMapping("/components-article")
    public String layoutDefault(Model model) {
        return "pages/components/components-article";
    }

    @GetMapping("/components-avatar")
    public String layoutAvatar(Model model) {
        return "pages/components/components-avatar";
    }

    @GetMapping("/components-chat-box")
    public String layoutChatBox(Model model) {
        return "pages/components/components-chat-box";
    }

    @GetMapping("/components-empty-state")
    public String layoutEmptyState(Model model) {
        return "pages/components/components-empty-state";
    }

    @GetMapping("/components-gallery")
    public String layoutGallery(Model model) {
        return "pages/components/components-gallery";
    }

    @GetMapping("/components-hero")
    public String layoutHero(Model model) {
        return "pages/components/components-hero";
    }

    @GetMapping("/components-multiple-upload")
    public String layoutMultipleUpload(Model model) {
        return "pages/components/components-multiple-upload";
    }

    @GetMapping("/components-pricing")
    public String layoutPricing(Model model) {
        return "pages/components/components-pricing";
    }

    @GetMapping("/components-statistic")
    public String layoutStatistic(Model model) {
        return "pages/components/components-statistic";
    }

    @GetMapping("/components-tab")
    public String layoutTab(Model model) {
        return "pages/components/components-tab";
    }

    @GetMapping("/components-table")
    public String layoutTable(Model model) {
        return "pages/components/components-table";
    }

    @GetMapping("/components-user")
    public String layoutUser(Model model) {
        return "pages/components/components-user";
    }

    @GetMapping("/components-wizard")
    public String layoutWizard(Model model) {
        return "pages/components/components-wizard";
    }
}
