package com.docu.server.adapter.out.persistence.faq;

import com.docu.server.adapter.out.persistence.cmm.entity.WordEntity;
import com.docu.server.adapter.out.persistence.faq.entity.FaqEntity;
import com.docu.server.biz.faq.port.out.FaqOutPort;
import com.docu.server.domain.cmm.WordAddReq;
import com.docu.server.domain.faq.FaqReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class FaqPersistenceAdapter implements FaqOutPort {

    private final FaqMapper mapper;

    @Transactional
    @Override
    public void getFaqList(FaqReq req) {
        FaqEntity entity = new FaqEntity();
        List<FaqEntity> faqList = mapper.selectFaqList(entity);
    }

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
}
