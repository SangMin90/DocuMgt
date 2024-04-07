package com.docu.server.domain.cmm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class WordDuplicateReq {
    private String wordName;
    private String engWordName;
}
