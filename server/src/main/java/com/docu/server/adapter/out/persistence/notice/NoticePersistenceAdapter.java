package com.docu.server.adapter.out.persistence.notice;

import com.docu.server.adapter.out.persistence.notice.entity.NoticeEntity;
import com.docu.server.adapter.out.persistence.notice.entity.NoticeTitleSearchEntity;
import com.docu.server.biz.notice.port.out.NoticeOutPort;
import com.docu.server.domain.notice.NoticeReq;
import com.docu.server.domain.notice.NoticeRes;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Slf4j
public class NoticePersistenceAdapter implements NoticeOutPort {

    private final NoticeMapper noticeMapper;

    @Transactional
    @Override
    public List<NoticeRes> getNoticeList(NoticeReq req) {
        NoticeTitleSearchEntity noticeTitleSearchEntity = NoticeTitleSearchEntity.builder()
                .noticeTitleName(req.getNoticeTitle())
                .build();

        List<NoticeEntity> noticeEntities = noticeMapper.getNoticeList(noticeTitleSearchEntity);

        return noticeEntities.stream().map(noticeEntity -> NoticeRes.builder()
                .noticeTitle(noticeEntity.getNoticeTitle())
                .noticeContent(noticeEntity.getNoticeContent())
                .build()).toList();

    }
}
