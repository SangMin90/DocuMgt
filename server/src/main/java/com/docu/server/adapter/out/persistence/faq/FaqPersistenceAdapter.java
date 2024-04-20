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
                .faqTitleName(req.getFaqQuestion()).build();
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
        return 0;
    }
    /*
    @Override
    public int insertStdWord(WordAddReq req) {

        int insertCnt = 0;

        try {
            WordEntity entity = WordEntity.builder()
                    .wordName(req.getWordName())
                    .engWordName(req.getEngWordName())
                    .wordDesc(req.getWordDesc()).build();

            insertCnt = mapper.insertStdWord(entity);
        } catch (Exception e) {
            log.error(e.getMessage());
        }

        return insertCnt;
    }
     */
}
