package com.docu.server.biz.faq.port.out;

import com.docu.server.domain.cmm.WordAddReq;
import com.docu.server.domain.cmm.WordReq;
import com.docu.server.domain.cmm.WordRes;
import com.docu.server.domain.faq.FaqAddReq;
import com.docu.server.domain.faq.FaqReq;



import java.util.List;

public interface FaqOutPort {
//    void getFaqList(FaqReq req);
    List<WordRes> getFaqList(FaqReq req);

    int insertStdWord(FaqAddReq req);
}
