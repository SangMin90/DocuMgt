package com.docu.server.biz.faq.service;

import com.docu.server.biz.faq.port.in.FaqInPort;
import com.docu.server.biz.faq.port.out.FaqOutPort;
import com.docu.server.domain.faq.FaqReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FaqService implements FaqInPort {

    private final FaqOutPort faqOutPort;

    @Override
    public void getFaqList(FaqReq req) {
        faqOutPort.getFaqList(req);
    }
}
