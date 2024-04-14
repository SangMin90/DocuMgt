package com.docu.server.adapter.in;

import com.docu.server.biz.faq.port.in.FaqInPort;
import com.docu.server.domain.faq.FaqReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class RestCsController {

    private final FaqInPort faqService;

    @PostMapping("/faq/list")
    public ResponseEntity<?> getFaqList(@RequestBody FaqReq req) {
        faqService.getFaqList(req);

        return ResponseEntity.ok().build();
    }
}
