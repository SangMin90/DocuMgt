package com.docu.server.adapter.in.web;

import org.springframework.web.bind.annotation.GetMapping;

public class AnnoucementController {
    @GetMapping("/annoucement")
    public String businessCardPopup() {
        return "annoucement.html";
    }
}