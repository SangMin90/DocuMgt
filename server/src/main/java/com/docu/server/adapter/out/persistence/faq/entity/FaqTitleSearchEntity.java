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

    private String faqTitleName; // 자주하는 질문 제목

}
