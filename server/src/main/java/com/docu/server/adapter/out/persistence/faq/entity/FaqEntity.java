package com.docu.server.adapter.out.persistence.faq.entity;

import com.sun.jna.WString;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FaqEntity {
    private Long requestFrequencyQuestionId;
    private String RequestFrequencyCategory;
    private String RequestFrequencyTitle;
    private String requestContents;
    private String regUserId;
    private String regDt;
    private String mdfrUserId;
    private String mdfrDt;
}
