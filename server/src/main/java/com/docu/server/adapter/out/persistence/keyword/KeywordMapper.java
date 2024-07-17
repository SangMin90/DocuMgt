package com.docu.server.adapter.out.persistence.keyword;

import com.docu.server.adapter.out.persistence.keyword.entity.KeywordEntity;
import com.docu.server.config.annotation.MapperInterface;

import java.util.List;

@MapperInterface
public interface KeywordMapper {

    List<KeywordEntity> selectKeywordList(KeywordEntity entity);
}
