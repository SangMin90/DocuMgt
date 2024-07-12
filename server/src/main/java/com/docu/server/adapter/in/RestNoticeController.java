package com.docu.server.adapter.in;

import com.docu.server.biz.faq.port.in.FaqInPort;
import com.docu.server.biz.notice.port.in.NoticeInPort;
import com.docu.server.domain.common.ResponseMessage;
import com.docu.server.domain.faq.FaqAddReq;
import com.docu.server.domain.faq.FaqReq;
import com.docu.server.domain.notice.NoticeReq;
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
public class RestNoticeController {
    private final NoticeInPort noticeService;

    @PostMapping("/notice/list")
    public ResponseEntity<?> getNoticeList(@RequestBody NoticeReq req) {

        ResponseMessage rsMsg = noticeService.getNoticeList(req);
        return new ResponseEntity<>(rsMsg, HttpStatus.OK);
    }

    @PostMapping("/notice/insert")
    public ResponseEntity<?> addRequestNotice(@RequestBody NoticeAddReq req) {

//        log.debug("RestCmmController addStdWord parameter: {}", req);

        ResponseMessage rsMsg = noticeService.addRequestNotice(req);
        return new ResponseEntity<>(rsMsg, HttpStatus.OK);
    }
}
