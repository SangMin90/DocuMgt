package com.docu.server.adapter.in;

import com.docu.server.biz.business.port.in.BusinessInPort;
import com.docu.server.domain.business.BusinessReq;
import com.docu.server.domain.common.ResponseMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class RestBusinessCardController {

    private final BusinessInPort businessService;

    @PostMapping("/business")
    public ResponseEntity<?> getBusinessCardList(@RequestBody BusinessReq req) {

        log.debug("RestBusinessCardController getStdWordList parameter: {}", req);

        ResponseMessage rsMsg = businessService.getBusinessList(req);
        return new ResponseEntity<>(rsMsg, HttpStatus.OK);
    }
}
