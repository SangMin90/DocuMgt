package com.docu.server.domain.faq;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FaqAddReq {
    private String requestFrequencyCategory;
    private String requestFrequencyTitle;
    private String requestFrequencyContents;
//    private String wordDesc;
}
