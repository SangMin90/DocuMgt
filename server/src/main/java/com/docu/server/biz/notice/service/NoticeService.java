package com.docu.server.biz.notice.service;

import com.docu.server.biz.notice.port.in.NoticeInPort;
import com.docu.server.biz.notice.port.out.NoticeOutPort;
import com.docu.server.domain.common.ResponseMessage;
import com.docu.server.domain.notice.NoticeReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NoticeService implements NoticeInPort {

    private final NoticeOutPort noticeOutPort;

    @Override
    public ResponseMessage getNoticeList(NoticeReq req) {
        noticeOutPort.getNoticeList(req);
        return null;
    }
}
