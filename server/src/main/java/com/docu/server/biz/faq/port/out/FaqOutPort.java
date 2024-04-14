package com.docu.server.biz.faq.port.out;

import com.docu.server.domain.faq.FaqReq;

public interface FaqOutPort {
    void getFaqList(FaqReq req);
}
