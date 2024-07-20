package com.docu.server.adapter.out.persistence.notice;

import com.docu.server.adapter.out.persistence.keyword.entity.KeywordEntity;
import com.docu.server.adapter.out.persistence.notice.entity.NoticeEntity;
import com.docu.server.biz.notice.port.out.NoticeOutPort;
import com.docu.server.domain.faq.FaqReq;
import com.docu.server.domain.keyword.KeywordRes;
import com.docu.server.domain.notice.NoticeReq;
import com.docu.server.domain.notice.NoticeRes;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
@Slf4j
public class NoticePersistenceAdapter implements NoticeOutPort {

    private final NoticeMapper noticeMapper;

    @Transactional
    @Override
    public List<NoticeRes> getNoticeList(NoticeReq req) {
        NoticeEntity entity = NoticeEntity.builder()
                .noticeTitle(req.getNoticeTitle())
                .build();

        List<NoticeEntity> result = noticeMapper.getNoticeList(entity);

        List<NoticeRes> res = new ArrayList<>();
        for (NoticeEntity noticeEntity : result) {
            res.add(NoticeRes.builder().noticeTitle(noticeEntity.getNoticeTitle())
                    .noticeContent(noticeEntity.getNoticeContent()).build());
        }

        return res;

    }
}
