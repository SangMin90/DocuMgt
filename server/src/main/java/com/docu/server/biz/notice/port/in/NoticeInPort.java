package com.docu.server.biz.notice.port.in;

import com.docu.server.domain.notice.NoticeReq;

public interface NoticeInPort {
    void getNoticeList(NoticeReq req);
}
