package com.docu.server.biz.cmm.port.in;

import com.docu.server.domain.cmm.CommonGroupCodeReq;
import com.docu.server.domain.cmm.WordAddReq;
import com.docu.server.domain.cmm.WordDuplicateReq;
import com.docu.server.domain.cmm.WordReq;
import com.docu.server.domain.common.ResponseMessage;

public interface CmmInPort {

    ResponseMessage getStdWordList(WordReq req);

    ResponseMessage addStdWord(WordAddReq req);

    ResponseMessage checkDuplicateStdWord(WordDuplicateReq req);

    ResponseMessage selectCommonCodeList(CommonGroupCodeReq req);
}
