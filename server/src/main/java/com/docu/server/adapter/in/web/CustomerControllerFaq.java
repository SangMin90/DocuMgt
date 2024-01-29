package com.docu.server.adapter.in.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerControllerFaq {
    @GetMapping("/customer/faq")
    public String memberManagement() {
        return "customerFAQManage.html";
    }
}


