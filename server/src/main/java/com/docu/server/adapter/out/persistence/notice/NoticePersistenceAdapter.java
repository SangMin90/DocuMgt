package com.docu.server.adapter.out.persistence.notice;

import com.docu.server.biz.notice.port.out.NoticeOutPort;
import com.docu.server.domain.faq.FaqReq;
import com.docu.server.domain.notice.NoticeReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Slf4j
public class NoticePersistenceAdapter implements NoticeOutPort {

    private final NoticeMapper mapper;

    @Override
    public void getNoticeList(NoticeReq req){

    }
}
