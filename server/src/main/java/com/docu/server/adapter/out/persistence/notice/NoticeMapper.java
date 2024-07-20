package com.docu.server.adapter.out.persistence.notice;

import com.docu.server.adapter.out.persistence.keyword.entity.KeywordEntity;
import com.docu.server.adapter.out.persistence.notice.entity.NoticeEntity;
import com.docu.server.config.annotation.MapperInterface;

import java.util.List;

@MapperInterface
public interface NoticeMapper {
    List<NoticeEntity> getNoticeList(NoticeEntity entity);
}
