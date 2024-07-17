package com.docu.server.biz.keyword.port.in;

import com.docu.server.domain.common.ResponseMessage;
import com.docu.server.domain.keyword.KeywordSearchReq;

public interface KeywordInPort {

    ResponseMessage getKeywordList(KeywordSearchReq req);
}
