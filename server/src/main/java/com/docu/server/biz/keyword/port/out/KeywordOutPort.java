package com.docu.server.biz.keyword.port.out;

import com.docu.server.domain.keyword.KeywordRes;
import com.docu.server.domain.keyword.KeywordSearchReq;

import java.util.List;

public interface KeywordOutPort {

    List<KeywordRes> selectKeywordList(KeywordSearchReq req);
}
