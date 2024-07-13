package com.docu.server.domain.cmm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CommonGroupCodeRes {
    private String grpCdId;
    private String grpCdNm;
    private String cdOdr;
    private String cdUseYn;
}
