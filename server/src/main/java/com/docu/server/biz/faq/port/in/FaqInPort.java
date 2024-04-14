package com.docu.server.biz.faq.port.in;

import com.docu.server.domain.faq.FaqReq;

public interface FaqInPort {
    void getFaqList(FaqReq req);
}
