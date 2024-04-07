package com.docu.server.domain.cmm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class WordRes {
    private Long id;
    private String wordName;
    private String engWordName;
    private String wordDesc;
}
