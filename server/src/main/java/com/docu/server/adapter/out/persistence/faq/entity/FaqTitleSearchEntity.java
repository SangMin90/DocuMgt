package com.docu.server.adapter.out.persistence.faq.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FaqTitleSearchEntity {

    private String faqTitleName; // 공통표준단어명
//    private String cmmStdWordNm; // 공통표준단어명
}
