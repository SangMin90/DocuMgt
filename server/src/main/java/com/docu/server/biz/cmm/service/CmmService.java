package com.docu.server.biz.cmm.service;

import com.docu.server.biz.cmm.port.in.CmmInPort;
import com.docu.server.biz.cmm.port.out.CmmOutPort;
import com.docu.server.domain.cmm.*;
import com.docu.server.domain.common.ResponseMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CmmService implements CmmInPort {

    private final CmmOutPort cmmOutPort;

    @Override
    public ResponseMessage getStdWordList(WordReq req) {
        ResponseMessage res;

        try {
            List<WordRes> stdWords = cmmOutPort.getStdWordList(req);
            res = ResponseMessage.builder()
                    .data(stdWords)
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage("공통표준용어 조회 완료")
                    .build();
        } catch (Exception e) {
            res = ResponseMessage.builder()
                    .data(null)
                    .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                    .resultMessage("공통표준용어 조회 실패")
                    .build();
        }

        return res;
    }

    @Override
    public ResponseMessage addStdWord(WordAddReq req) {
        ResponseMessage res;

        try {
            cmmOutPort.insertStdWord(req);
            res = ResponseMessage.builder()
                    .data(null)
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage("공통표준단어 등록 완료")
                    .build();
        } catch (Exception e) {
            res = ResponseMessage.builder()
                    .data(null)
                    .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                    .resultMessage("공통표준단어 등록 실패")
                    .build();
        }

        return res;
    }

    @Override
    public ResponseMessage checkDuplicateStdWord(WordDuplicateReq req) {
        ResponseMessage res;

        try {
            WordDuplicateRes existFlag = cmmOutPort.exists(req);
            res = ResponseMessage.builder()
                    .data(existFlag)
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage("공통표준단어 중복체크 성공")
                    .build();
        } catch (Exception e) {
            res = ResponseMessage.builder()
                    .data(null)
                    .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                    .resultMessage("공통표준단어 중복체크 실패")
                    .build();
        }

        return res;
    }
}
