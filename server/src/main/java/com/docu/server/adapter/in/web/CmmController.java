package com.docu.server.adapter.in.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CmmController {

    @GetMapping("/cmm/std-word")
    public String renderCmmStdWord() {
        return "pages/cmm/word/main";
    }

    @GetMapping("/cmm/cd")
    public String renderCmmCd() {
        return "pages/cmm/code/main";
    }
}
