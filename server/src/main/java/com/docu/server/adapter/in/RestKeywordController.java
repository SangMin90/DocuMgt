package com.docu.server.adapter.in;

import com.docu.server.biz.keyword.port.in.KeywordInPort;
import com.docu.server.domain.common.ResponseMessage;
import com.docu.server.domain.keyword.KeywordSearchReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class RestKeywordController {

    private final KeywordInPort keywordService;

    @PostMapping("/keyword/list")
    public ResponseEntity<ResponseMessage> getKeywordList(@RequestBody KeywordSearchReq req) {

        ResponseMessage res = keywordService.getKeywordList(req);

        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
