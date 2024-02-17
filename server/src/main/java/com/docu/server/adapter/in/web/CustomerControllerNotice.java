package com.docu.server.adapter.in.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerControllerNotice {
    @GetMapping("/customer/notice")
    public String memberManagement() {
        return "customerNoticeManage.html";
    }
}


