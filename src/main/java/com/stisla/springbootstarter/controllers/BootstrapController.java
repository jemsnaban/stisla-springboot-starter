package com.stisla.springbootstarter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BootstrapController {

    @GetMapping("/bootstrap-alert")
    public String bootstrapAlert(Model model) {
        return "pages/bootstrap/bootstrap-alert";
    }

    @GetMapping("/bootstrap-badge")
    public String bootstrapBadge(Model model) {
        return "pages/bootstrap/bootstrap-badge";
    }

    @GetMapping("/bootstrap-breadcrumb")
    public String bootstrapBreadcrumb(Model model) {
        return "pages/bootstrap/bootstrap-breadcrumb";
    }

    @GetMapping("/bootstrap-buttons")
    public String bootstrapButtons(Model model) {
        return "pages/bootstrap/bootstrap-buttons";
    }

    @GetMapping("/bootstrap-card")
    public String bootstrapCard(Model model) {
        return "pages/bootstrap/bootstrap-card";
    }

    @GetMapping("/bootstrap-carousel")
    public String bootstrapCarousel(Model model) {
        return "pages/bootstrap/bootstrap-carousel";
    }

    @GetMapping("/bootstrap-collapse")
    public String bootstrapCollapse(Model model) {
        return "pages/bootstrap/bootstrap-collapse";
    }

    @GetMapping("/bootstrap-dropdown")
    public String bootstrapDropdown(Model model) {
        return "pages/bootstrap/bootstrap-dropdown";
    }

    @GetMapping("/bootstrap-form")
    public String bootstrapForm(Model model) {
        return "pages/bootstrap/bootstrap-form";
    }

    @GetMapping("/bootstrap-list-group")
    public String bootstrapListGroup(Model model) {
        return "pages/bootstrap/bootstrap-list-group";
    }
    @GetMapping("/bootstrap-media-object")
    public String bootstrapMediaObject(Model model) {
        return "pages/bootstrap/bootstrap-media-object";
    }

    @GetMapping("/bootstrap-modal")
    public String bootstrapModal(Model model) {
        return "pages/bootstrap/bootstrap-modal";
    }

    @GetMapping("/bootstrap-nav")
    public String bootstrapNav(Model model) {
        return "pages/bootstrap/bootstrap-nav";
    }

    @GetMapping("/bootstrap-navbar")
    public String bootstrapNavbar(Model model) {
        return "pages/bootstrap/bootstrap-navbar";
    }

    @GetMapping("/bootstrap-pagination")
    public String bootstrapPagination(Model model) {
        return "pages/bootstrap/bootstrap-pagination";
    }

    @GetMapping("/bootstrap-popover")
    public String bootstrapPopover(Model model) {
        return "pages/bootstrap/bootstrap-popover";
    }

    @GetMapping("/bootstrap-progress")
    public String bootstrapProgress(Model model) {
        return "pages/bootstrap/bootstrap-progress";
    }

    @GetMapping("/bootstrap-table")
    public String bootstrapTable(Model model) {
        return "pages/bootstrap/bootstrap-table";
    }

    @GetMapping("/bootstrap-tooltip")
    public String bootstrapTooltip(Model model) {
        return "pages/bootstrap/bootstrap-tooltip";
    }

    @GetMapping("/bootstrap-typography")
    public String bootstrapTypography(Model model) {
        return "pages/bootstrap/bootstrap-typography";
    }
}
