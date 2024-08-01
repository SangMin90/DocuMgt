package com.docu.server.biz.notice.service;

import com.docu.server.biz.notice.port.in.NoticeInPort;
import com.docu.server.biz.notice.port.out.NoticeOutPort;
import com.docu.server.domain.common.ResponseMessage;
import com.docu.server.domain.notice.NoticeAddReq;
import com.docu.server.domain.notice.NoticeReq;
import com.docu.server.domain.notice.NoticeRes;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoticeService implements NoticeInPort {

    private final NoticeOutPort noticeOutPort;

    @Override
    public ResponseMessage getNoticeList(NoticeReq req) {
        ResponseMessage res;


        try{
            List<NoticeRes> noticeResLists = noticeOutPort.getNoticeList(req);
            res = ResponseMessage.builder()
                    .data(noticeResLists)
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage("공지사항 조회 완료")
                    .build();
        }catch (Exception e){
            res = ResponseMessage.builder()
                    .data(null)
                    .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                    .resultMessage("공지사항 조회 실패")
                    .build();
        }

        return res;
    }

    @Override
    public ResponseMessage addRequestNotice(NoticeAddReq req) {
        ResponseMessage res;

        try {noticeOutPort.insertRequestNotice(req);
            res = ResponseMessage.builder()
                    .data(null)
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage("질문등록 완료")
                    .build();
        } catch (Exception e) {
            res = ResponseMessage.builder()
                    .data(null)
                    .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                    .resultMessage("질문등록 실패")
                    .build();
        }

        return res;
    }
}
