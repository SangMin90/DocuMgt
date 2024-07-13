package com.docu.server.adapter.out.persistence.cmm.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GroupCodeEntity {
    private String grpCdId;
    private String grpCdNm;
    private String grpCdOdr;
    private String grpCdUseYn;
    private String regUserId;
    private String mdfrUserId;
}
