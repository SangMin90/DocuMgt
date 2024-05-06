package com.docu.server.adapter.out.persistence.business;

import com.docu.server.biz.cmm.port.out.BusinessOutPort;
import com.docu.server.domain.business.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Slf4j
@Repository
@RequiredArgsConstructor
public class BusinessPersistenceAdapter implements BusinessOutPort {

    private final BusinessMapper mapper;

    @Transactional
    @Override
    public List<WordRes> getStdWordList(WordReq req) {

        WordSearchEntity searchEntity = WordSearchEntity.builder().cmmStdWordNm(req.getBusinessWordNm()).build();
        List<WordEntity> wordEntities = mapper.selectBusinessWordList(searchEntity);

        return wordEntities.stream()
                .map(entity -> BusinessRes.builder()
                        .wordName(entity.getBusinessName())
                        .engWordName(entity.getBusinessName())
                        .wordDesc(entity.getBusinessDesc())
                        .build())
                .toList();
    }

    @Override
    public int insertStdWord(BusinessAddReq req) {

        int insertCnt = 0;

        try {
            BusinessEntity entity = BusinessEntity.builder()
                    .wordName(req.getWordName())
                    .engWordName(req.getEngWordName())
                    .wordDesc(req.getWordDesc()).build();

            insertCnt = mapper.insertBusinessWord(entity);
        } catch (Exception e) {
            log.error(e.getMessage());
        }

        return insertCnt;
    }

    @Override
    public BusinessRes exists(BusinessReq req) {

        BusinessRes res = null;

        try {
            BusinessEntity entity = BusinessEntity.builder()
                    .BusinessName(req.getBusinessName())
                    .getBusinessName(req.getBusinessName())
                    .build();

            int duplicateCnt = mapper.exists(entity);

            if (duplicateCnt > 0) {
                res = BusinessRes.builder().existFlag(true).build();
            } else {
                res = BusinessRes.builder().existFlag(false).build();
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }

        return res;
    }
}
