package com.docu.server.adapter.out.persistence.notice;

import com.docu.server.adapter.out.persistence.faq.entity.FaqEntity;
import com.docu.server.adapter.out.persistence.notice.entity.NoticeEntity;
import com.docu.server.adapter.out.persistence.notice.entity.NoticeTitleSearchEntity;
import com.docu.server.config.annotation.MapperInterface;

import java.util.List;

@MapperInterface
public interface NoticeMapper {
    List<NoticeEntity> getNoticeList(NoticeTitleSearchEntity entity);

    int insertRequestNotice(NoticeEntity entity);
}
