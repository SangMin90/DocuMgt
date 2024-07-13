package com.docu.server.domain.keyword;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class KeywordRes {

    private String keywordName;
    private String keywordDesc;
    private String keywordUseFlag;
}
