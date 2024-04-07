package com.docu.server.adapter.out.persistence.cmm.entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WordEntity {
    private Long id;
    private String wordName;
    private String engWordName;
    private String wordDesc;
    private String regUserId;
    private String regDt;
    private String mdfrUserId;
    private String mdfrDt;
}
