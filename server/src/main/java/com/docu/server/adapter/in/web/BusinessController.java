package com.docu.server.adapter.in.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BusinessController {

    // 화면 노출
    @GetMapping("/businessCard")
    public String renderBusinessStdWord() {
        return "pages/business/card";
    }
}
