package com.stisla.springbootstarter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GmapsController {

    @GetMapping("/gmaps-advanced-route")
    public String gmapsAdvancedRoute(Model model) {
        return "pages/gmaps/gmaps-advanced-route";
    }

    @GetMapping("/gmaps-draggable-marker")
    public String gmapsDraggableMarker(Model model) {
        return "pages/gmaps/gmaps-draggable-marker";
    }

    @GetMapping("/gmaps-geocoding")
    public String gmapsGeocoding(Model model) {
        return "pages/gmaps/gmaps-geocoding";
    }

    @GetMapping("/gmaps-geolocation")
    public String gmapsGeolocation(Model model) {
        return "pages/gmaps/gmaps-geolocation";
    }

    @GetMapping("/gmaps-marker")
    public String gmapsMarker(Model model) {
        return "pages/gmaps/gmaps-marker";
    }

    @GetMapping("/gmaps-multiple-marker")
    public String gmapsMultipleMarker(Model model) {
        return "pages/gmaps/gmaps-multiple-marker";
    }

    @GetMapping("/gmaps-route")
    public String gmapsRoute(Model model) {
        return "pages/gmaps/gmaps-route";
    }

    @GetMapping("/gmaps-simple")
    public String gmapsSimple(Model model) {
        return "pages/gmaps/gmaps-simple";
    }
}
