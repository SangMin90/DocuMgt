package com.docu.server.adapter.in.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerControllerNotice {
    @GetMapping("/notice/list")
    public String memberManagement() {
        return "pages/notice/notice";
    }
}


