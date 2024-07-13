package com.docu.server.adapter.in.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class KeywordController {

    @GetMapping("/keyword")
    public String getKeyword() {
        return "pages/keyword/main";
    }

}
