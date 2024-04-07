package com.docu.server.adapter.out.persistence.cmm;

import com.docu.server.adapter.out.persistence.cmm.entity.WordEntity;
import com.docu.server.adapter.out.persistence.cmm.entity.WordSearchEntity;
import com.docu.server.biz.cmm.port.out.CmmOutPort;
import com.docu.server.domain.cmm.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Slf4j
@Repository
@RequiredArgsConstructor
public class CmmPersistenceAdapter implements CmmOutPort {

    private final CmmMapper mapper;

    @Transactional
    @Override
    public List<WordRes> getStdWordList(WordReq req) {

        WordSearchEntity searchEntity = WordSearchEntity.builder().cmmStdWordNm(req.getCmmStdWordNm()).build();
        List<WordEntity> wordEntities = mapper.selectStdWordList(searchEntity);

        return wordEntities.stream()
                .map(entity -> WordRes.builder()
                        .wordName(entity.getWordName())
                        .engWordName(entity.getEngWordName())
                        .wordDesc(entity.getWordDesc())
                        .build())
                .toList();
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

    @Override
    public WordDuplicateRes exists(WordDuplicateReq req) {

        WordDuplicateRes res = null;

        try {
            WordEntity entity = WordEntity.builder()
                    .wordName(req.getWordName())
                    .engWordName(req.getEngWordName())
                    .build();

            int duplicateCnt = mapper.exists(entity);

            if (duplicateCnt > 0) {
                res = WordDuplicateRes.builder().existFlag(true).build();
            } else {
                res = WordDuplicateRes.builder().existFlag(false).build();
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }

        return res;
    }
}
