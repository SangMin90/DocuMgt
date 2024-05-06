package com.docu.server.adapter.in.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BusinessController {

    @GetMapping("/businessCard")
    public String businessCard() {
        return "businessCard";
    }

    // 화면 노출
    @GetMapping("/business")
    public String renderBusinessStdWord() {
        return "pages/business/card";
    }
}
