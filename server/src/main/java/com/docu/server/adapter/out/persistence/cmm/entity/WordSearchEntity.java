package com.docu.server.adapter.out.persistence.cmm.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class WordSearchEntity {

    private String cmmStdWordNm; // 공통표준단어명
}
