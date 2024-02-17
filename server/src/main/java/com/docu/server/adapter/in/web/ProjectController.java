package com.docu.server.adapter.in.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {

    @GetMapping("/project/manage")
    public String renderProject() {
        return "projectManage.html";
    }
}
