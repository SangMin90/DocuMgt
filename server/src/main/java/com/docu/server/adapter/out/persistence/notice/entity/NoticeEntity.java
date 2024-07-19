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
    Private string noticeId;
    Private string noticeUserId;
    Private string noticeGubunCode;
    Private string noticeTitle;
    Private string noticeContent;
    Private string noticePopupFlag;
    Private string noticeBeginDate;
    Private string noticeEndDate;
    Private string regUserId;

}
