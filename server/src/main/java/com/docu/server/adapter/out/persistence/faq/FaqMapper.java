package com.docu.server.adapter.out.persistence.faq;

import com.docu.server.adapter.out.persistence.faq.entity.FaqEntity;
import com.docu.server.adapter.out.persistence.faq.entity.FaqTitleSearchEntity;
import com.docu.server.config.annotation.MapperInterface;

import java.util.List;

@MapperInterface
public interface FaqMapper {
    List<FaqEntity> selectFaqList(FaqTitleSearchEntity entity);

    int insertRequestFaq(FaqEntity entity);
}
