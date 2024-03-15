package com.docu.server.adapter.in.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BusinessPopupController {

    @GetMapping("/businessCard/popup")
    public String businessCardPopup() {
        return "businessCardPopup.html";
    }
}
