package com.docu.server.adapter.out.persistence.business.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BusinessEntity {
    private Long id;
    private String wordName;
    private String engWordName;
    private String wordDesc;
    private String regUserId;
    private String regDt;
    private String mdfrUserId;
    private String mdfrDt;
}
