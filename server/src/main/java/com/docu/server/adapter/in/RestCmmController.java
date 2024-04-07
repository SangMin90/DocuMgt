package com.docu.server.adapter.in;

import com.docu.server.domain.cmm.WordAddReq;
import com.docu.server.domain.cmm.WordDuplicateReq;
import com.docu.server.domain.cmm.WordReq;
import com.docu.server.domain.common.ResponseMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.docu.server.biz.cmm.port.in.CmmInPort;

@RestController
@RequiredArgsConstructor
@Slf4j
public class RestCmmController {

    private final CmmInPort cmmService;

    @PostMapping("/cmm/std-word/list")
    public ResponseEntity<?> getStdWordList(@RequestBody WordReq req) {

        log.debug("RestCmmController getStdWordList parameter: {}", req);

        ResponseMessage rsMsg = cmmService.getStdWordList(req);
        return new ResponseEntity<>(rsMsg, HttpStatus.OK);
    }

    @PostMapping("/cmm/std-word/add")
    public ResponseEntity<?> addStdWord(@RequestBody WordAddReq req) {

        log.debug("RestCmmController addStdWord parameter: {}", req);

        ResponseMessage rsMsg = cmmService.addStdWord(req);
        return new ResponseEntity<>(rsMsg, HttpStatus.OK);
    }

    @PostMapping("/cmm/std-word/check-duplicate")
    public ResponseEntity<?> checkDuplicateStdWord(@RequestBody WordDuplicateReq req) {

        log.debug("RestCmmController checkDuplicateStdWord parameter: {}", req);

        ResponseMessage rsMsg = cmmService.checkDuplicateStdWord(req);
        return new ResponseEntity<>(rsMsg, HttpStatus.OK);
    }
}
