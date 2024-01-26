package com.docu.server.adapter.in.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    @GetMapping("/member/manage")
    public String memberManagement() {
        return "memberManage.html";
    }
}
