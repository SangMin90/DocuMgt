package com.docu.server.domain.notice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class NoticeAddReq {
    private String noticeGubunCode;
    private String noticeTitle;
    private String noticeContent;
//    private String wordDesc;
}
