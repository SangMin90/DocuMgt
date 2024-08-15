package com.docu.server.adapter.out.persistence.business.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BusinessEntity {
    private String businessName;
    private String businessCom;

}
