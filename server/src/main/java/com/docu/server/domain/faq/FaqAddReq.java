package com.docu.server.domain.faq;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FaqAddReq {
    private String reqeustFrequencyCategory;
    private String reqeustFrequencyTitle;
    private String reqeustFrequencyContents;
//    private String wordDesc;
}
