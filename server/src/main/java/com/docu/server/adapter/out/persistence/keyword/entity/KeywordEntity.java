package com.docu.server.adapter.out.persistence.keyword.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class KeywordEntity {
    private String keywordId;
    private String keywordName;
    private String keywordDesc;
    private String keywordUseFlag;
    private String regUserId;
    private String regDt;
    private String mdfrUserId;
    private String mdfrDt;
}
