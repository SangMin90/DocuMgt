package com.docu.server.domain.business;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BusinessAddReq {
    private String wordName;
    private String engWordName;
    private String wordDesc;
}
