package com.docu.server.adapter.out.persistence.keyword;

import com.docu.server.adapter.out.persistence.keyword.entity.KeywordEntity;
import com.docu.server.biz.keyword.port.out.KeywordOutPort;
import com.docu.server.domain.keyword.KeywordRes;
import com.docu.server.domain.keyword.KeywordSearchReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Slf4j
@Repository
@RequiredArgsConstructor
public class KeywordPersistenceAdapter implements KeywordOutPort {

    private final KeywordMapper keywordMapper;

    @Transactional
    @Override
    public List<KeywordRes> selectKeywordList(KeywordSearchReq req) {

        KeywordEntity entity = KeywordEntity.builder()
                .keywordName(req.getKeywordName())
                .build();

        List<KeywordEntity> result = keywordMapper.selectKeywordList(entity);

        List<KeywordRes> res = new ArrayList<>();
        for (KeywordEntity keywordEntity : result) {
            res.add(KeywordRes.builder().keywordName(keywordEntity.getKeywordName()).keywordDesc(keywordEntity.getKeywordDesc()).build());
        }

        return res;
    }
}
