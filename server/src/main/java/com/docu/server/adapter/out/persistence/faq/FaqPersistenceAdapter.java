package com.docu.server.adapter.out.persistence.faq;

import com.docu.server.adapter.out.persistence.faq.entity.FaqEntity;
import com.docu.server.biz.faq.port.out.FaqOutPort;
import com.docu.server.domain.faq.FaqReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class FaqPersistenceAdapter implements FaqOutPort {

    private final FaqMapper mapper;

    @Override
    public void getFaqList(FaqReq req) {
        FaqEntity entity = new FaqEntity();
        List<FaqEntity> faqList = mapper.getFaqList(entity);
    }
}
