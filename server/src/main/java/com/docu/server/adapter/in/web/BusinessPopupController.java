package com.docu.server.adapter.in.web;

import org.springframework.web.bind.annotation.GetMapping;

public class BusinessPopupController {

    @GetMapping("/businessCard/popup")
    public String businessCardPopup() {
        return "businessCardPopup.html";
    }
}
