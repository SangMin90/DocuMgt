package com.docu.server.domain.business;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BusinessRes {
    private String businessName;
    private String businessCom;
}
