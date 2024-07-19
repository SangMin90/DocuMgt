package com.docu.server.adapter.out.persistence.notice;

import com.docu.server.adapter.out.persistence.keyword.entity.KeywordEntity;
import com.docu.server.adapter.out.persistence.notice.entity.NoticeEntity;

import java.util.List;

public interface NoticeMapper {
    List<KeywordEntity> selectNoticeList(NoticeEntity entity);
}
