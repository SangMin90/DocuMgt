package com.docu.server.biz.faq.service;

import com.docu.server.biz.faq.port.in.FaqInPort;
import com.docu.server.biz.faq.port.out.FaqOutPort;
import com.docu.server.domain.cmm.WordAddReq;
import com.docu.server.domain.common.ResponseMessage;
import com.docu.server.domain.faq.FaqAddReq;
import com.docu.server.domain.faq.FaqReq;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FaqService implements FaqInPort {

    private final FaqOutPort faqOutPort;

    @Override
    public void getFaqList(FaqReq req) {
        faqOutPort.getFaqList(req);
    }

    @Override
    public ResponseMessage insertRequestFaq(FaqAddReq req) {
        ResponseMessage res;

        try {
            FaqOutPort.insertRequestFaq(req);
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
