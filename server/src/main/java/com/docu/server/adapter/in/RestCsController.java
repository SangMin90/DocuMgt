package com.docu.server.adapter.in;

import com.docu.server.biz.cmm.port.in.CmmInPort;
import com.docu.server.biz.faq.port.in.FaqInPort;
import com.docu.server.domain.cmm.WordAddReq;
import com.docu.server.domain.cmm.WordDuplicateReq;
import com.docu.server.domain.cmm.WordReq;
import com.docu.server.domain.common.ResponseMessage;
import com.docu.server.domain.faq.FaqReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
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

        ResponseMessage rsMsg = cmmService.getStdWordList(req);
        return new ResponseEntity<>(rsMsg, HttpStatus.OK);
    }

    @PostMapping("/faq/add")
    public ResponseEntity<?> addStdWord(@RequestBody WordAddReq req) {

        ResponseMessage rsMsg = cmmService.addStdWord(req);
        return new ResponseEntity<>(rsMsg, HttpStatus.OK);
    }

    @PostMapping("/faq/check-duplicate")
    public ResponseEntity<?> checkDuplicateStdWord(@RequestBody WordDuplicateReq req) {

        ResponseMessage rsMsg = cmmService.checkDuplicateStdWord(req);
        return new ResponseEntity<>(rsMsg, HttpStatus.OK);
    }
}
