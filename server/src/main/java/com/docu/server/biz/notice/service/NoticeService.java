package com.docu.server.biz.notice.service;

import com.docu.server.biz.notice.port.in.NoticeInPort;
import com.docu.server.biz.notice.port.out.NoticeOutPort;
import com.docu.server.domain.common.ResponseMessage;
import com.docu.server.domain.keyword.KeywordRes;
import com.docu.server.domain.notice.NoticeReq;
import com.docu.server.domain.notice.NoticeRes;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoticeService implements NoticeInPort {

    private final NoticeOutPort noticeOutPort;

    @Override
    public ResponseMessage getNoticeList(NoticeReq req) {


        List<NoticeRes> res = noticeOutPort.getNoticeList(req);

        return ResponseMessage.builder().data(res).statusCode(200).build();
    }
}
