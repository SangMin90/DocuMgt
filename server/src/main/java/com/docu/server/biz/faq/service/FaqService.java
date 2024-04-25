package com.docu.server.biz.faq.service;

import com.docu.server.biz.faq.port.in.FaqInPort;
import com.docu.server.biz.faq.port.out.FaqOutPort;
import com.docu.server.domain.common.ResponseMessage;
import com.docu.server.domain.faq.FaqAddReq;
import com.docu.server.domain.faq.FaqReq;
import com.docu.server.domain.faq.FaqRes;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FaqService implements FaqInPort {

    private final FaqOutPort faqOutPort;

    @Override
    public ResponseMessage getFaqList(FaqReq req) {
        ResponseMessage res;

        try {
            List<FaqRes> faqLists = faqOutPort.getFaqList(req);
            res = ResponseMessage.builder()
                    .data(faqLists)
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage("자주하는 질문 조회 완료")
                    .build();
        } catch (Exception e) {
            res = ResponseMessage.builder()
                    .data(null)
                    .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                    .resultMessage("자주하는 질문 조회 실패")
                    .build();
        }

        return res;

    }


    @Override
    public ResponseMessage addRequestFaq(FaqAddReq req) {
        ResponseMessage res;

        try {faqOutPort.insertRequestFaq(req);
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
