package com.docu.server.biz.faq.port.out;

import com.docu.server.domain.faq.FaqAddReq;
import com.docu.server.domain.faq.FaqReq;
import com.docu.server.domain.faq.FaqRes;


import java.util.List;

public interface FaqOutPort {

    List<FaqRes> getFaqList(FaqReq req);

    int insertRequestFaq(FaqAddReq req);

}
