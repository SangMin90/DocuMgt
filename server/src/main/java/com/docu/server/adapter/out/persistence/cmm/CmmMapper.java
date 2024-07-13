package com.docu.server.adapter.out.persistence.cmm;

import com.docu.server.adapter.out.persistence.cmm.entity.GroupCodeEntity;
import com.docu.server.adapter.out.persistence.cmm.entity.WordEntity;
import com.docu.server.adapter.out.persistence.cmm.entity.WordSearchEntity;
import com.docu.server.config.annotation.MapperInterface;
import com.docu.server.domain.cmm.CommonGroupCodeRes;

import java.util.List;

@MapperInterface
public interface CmmMapper {
    List<WordEntity> selectStdWordList(WordSearchEntity entity);

    int insertStdWord(WordEntity entity);

    int exists(WordEntity entity);

    List<GroupCodeEntity> selectCommonCodeList(GroupCodeEntity entity);
}
