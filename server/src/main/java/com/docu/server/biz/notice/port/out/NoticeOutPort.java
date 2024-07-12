package com.docu.server.biz.notice.port.out;

import com.docu.server.domain.faq.FaqAddReq;
import com.docu.server.domain.faq.FaqReq;
import com.docu.server.domain.faq.FaqRes;

import java.util.List;

public interface NoticeOutPort {
    List<NoticeRes> getNoticeList(FaqReq req);

//    int insertRequestFaq(FaqAddReq req);
}
