package com.docu.server.domain.faq;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FaqRes {
    private Long requestFrequencyQuestionId;
    private String requestFrequencyCategory;
    private String requestFrequencyTitle;
    private String requestContents;
}
