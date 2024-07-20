package com.docu.server.adapter.out.persistence.notice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NoticeEntity {
    private String noticeId;
    private String noticeUserId;
    private String noticeGubunCode;
    private String noticeTitle;
    private String noticeContent;
    private String noticePopupFlag;
    private String noticeBeginDate;
    private String noticeEndDate;
    private String regUserId;

}
