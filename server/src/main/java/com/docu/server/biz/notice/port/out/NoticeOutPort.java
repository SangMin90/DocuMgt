package com.docu.server.biz.notice.port.out;

import com.docu.server.domain.notice.NoticeAddReq;
import com.docu.server.domain.notice.NoticeReq;
import com.docu.server.domain.notice.NoticeRes;

import java.util.List;

public interface NoticeOutPort {
    List<NoticeRes> getNoticeList(NoticeReq req);

    int insertRequestNotice(NoticeAddReq req);
}
