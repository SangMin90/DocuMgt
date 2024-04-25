package com.docu.server.adapter.out.persistence.faq;

import com.docu.server.adapter.out.persistence.faq.entity.FaqEntity;
import com.docu.server.adapter.out.persistence.faq.entity.FaqTitleSearchEntity;
import com.docu.server.biz.faq.port.out.FaqOutPort;
import com.docu.server.domain.faq.FaqAddReq;
import com.docu.server.domain.faq.FaqReq;
import com.docu.server.domain.faq.FaqRes;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Repository
@RequiredArgsConstructor
public class FaqPersistenceAdapter implements FaqOutPort {

    private final FaqMapper mapper;

    @Transactional
    @Override
    public List<FaqRes> getFaqList(FaqReq req) {
        FaqTitleSearchEntity faqTitleSearchEntity = FaqTitleSearchEntity.builder()
                .faqTitleName(req.getFaqTitleName()).build();
        List<FaqEntity> faqEntities = mapper.selectFaqList(faqTitleSearchEntity);

        return faqEntities.stream()
                .map(faqEntity -> FaqRes.builder()
                        .requestFrequencyCategory(faqEntity.getRequestFrequencyCategory())
                        .requestFrequencyTitle(faqEntity.getRequestFrequencyTitle())
                        .requestContents(faqEntity.getRequestContents())
                        .build())
                .toList();
    }

    @Override
    public int insertRequestFaq(FaqAddReq req) {

        int insertCnt = 0;

        try {
            FaqEntity entity = FaqEntity.builder()
                    .requestFrequencyCategory(req.getReqeustFrequencyCategory())
                    .requestFrequencyTitle(req.getReqeustFrequencyTitle())
                    .requestContents(req.getReqeustFrequencyContents()).build();

            insertCnt = mapper.insertRequestFaq(entity);
        } catch (Exception e) {
            log.error(e.getMessage());
        }

        return insertCnt;
    }

}
