package com.stisla.springbootstarter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ModulesController {

    @GetMapping("/modules-calendar")
    public String modulesCalendar(Model model) {
        return "pages/modules/modules-calendar";
    }

    @GetMapping("/modules-chart-js")
    public String modulesChartJs(Model model) {
        return "pages/modules/modules-chart-js";
    }

    @GetMapping("/modules-datatables")
    public String modulesDatatables(Model model) {
        return "pages/modules/modules-datatables";
    }

    @GetMapping("/modules-flag")
    public String modulesFlag(Model model) {
        return "pages/modules/modules-flag";
    }

    @GetMapping("/modules-font-awesome")
    public String modulesFontAwesome(Model model) {
        return "pages/modules/modules-font-awesome";
    }

    @GetMapping("/modules-ion-icons")
    public String modulesIonIcons(Model model) {
        return "pages/modules/modules-ion-icons";
    }

    @GetMapping("/modules-owl-carousel")
    public String modulesOwlCarousel(Model model) {
        return "pages/modules/modules-owl-carousel";
    }

    @GetMapping("/modules-sparkline")
    public String modulesSparkline(Model model) {
        return "pages/modules/modules-sparkline";
    }

    @GetMapping("/modules-sweet-alert")
    public String modulesSweetAlert(Model model) {
        return "pages/modules/modules-sweet-alert";
    }

    @GetMapping("/modules-toastr")
    public String modulesToastr(Model model) {
        return "pages/modules/modules-toastr";
    }

    @GetMapping("/modules-vector-map")
    public String modulesVectorMap(Model model) {
        return "pages/modules/modules-vector-map";
    }

    @GetMapping("/modules-weather-icon")
    public String modulesWeatherIcon(Model model) {
        return "pages/modules/modules-weather-icon";
    }
}
