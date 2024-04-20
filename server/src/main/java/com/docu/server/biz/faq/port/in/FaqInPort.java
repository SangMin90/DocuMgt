package com.docu.server.biz.faq.port.in;

import com.docu.server.domain.common.ResponseMessage;
import com.docu.server.domain.faq.FaqReq;

public interface FaqInPort {
    ResponseMessage getFaqList(FaqReq req);
}
