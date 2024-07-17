package com.docu.server.biz.keyword.service;

import com.docu.server.biz.keyword.port.in.KeywordInPort;
import com.docu.server.biz.keyword.port.out.KeywordOutPort;
import com.docu.server.domain.common.ResponseMessage;
import com.docu.server.domain.keyword.KeywordRes;
import com.docu.server.domain.keyword.KeywordSearchReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KeywordService implements KeywordInPort {

    private final KeywordOutPort keywordOutPort;

    @Override
    public ResponseMessage getKeywordList(KeywordSearchReq req) {

        List<KeywordRes> res = keywordOutPort.selectKeywordList(req);

        return ResponseMessage.builder().data(res).statusCode(200).build();
    }
}
