package com.docu.server.biz.notice.port.in;

import com.docu.server.domain.common.ResponseMessage;
import com.docu.server.domain.faq.FaqAddReq;
import com.docu.server.domain.notice.NoticeAddReq;
import com.docu.server.domain.notice.NoticeReq;

public interface NoticeInPort {
    ResponseMessage getNoticeList(NoticeReq req);

    ResponseMessage addRequestNotice(NoticeAddReq req);
}
