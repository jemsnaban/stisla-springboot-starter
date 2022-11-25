package com.stisla.springbootstarter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FeaturesController {

    @GetMapping("/features-activities")
    public String featuresActivities(Model model) {
        return "pages/features/features-activities";
    }

    @GetMapping("/features-post-create")
    public String featuresPostCreate(Model model) {
        return "pages/features/features-post-create";
    }

    @GetMapping("/features-posts")
    public String featuresPosts(Model model) {
        return "pages/features/features-posts";
    }

    @GetMapping("/features-profile")
    public String featuresProfile(Model model) {
        return "pages/features/features-profile";
    }

    @GetMapping("/features-settings")
    public String featuresSettings(Model model) {
        return "pages/features/features-settings";
    }

    @GetMapping("/features-setting-detail")
    public String featuresSettingDetail(Model model) {
        return "pages/features/features-setting-detail";
    }

    @GetMapping("/features-tickets")
    public String featuresTickets(Model model) {
        return "pages/features/features-tickets";
    }

}
