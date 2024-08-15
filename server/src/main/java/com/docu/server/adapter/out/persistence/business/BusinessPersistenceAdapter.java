package com.docu.server.adapter.out.persistence.business;

import com.docu.server.adapter.out.persistence.business.entity.BusinessCardSearchEntity;
import com.docu.server.adapter.out.persistence.business.entity.BusinessEntity;
import com.docu.server.adapter.out.persistence.cmm.entity.WordEntity;
import com.docu.server.adapter.out.persistence.cmm.entity.WordSearchEntity;
import com.docu.server.biz.business.port.out.BusinessOutPort;
import com.docu.server.domain.business.*;
import com.docu.server.domain.cmm.WordRes;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Slf4j
@Repository
@RequiredArgsConstructor
public class BusinessPersistenceAdapter implements BusinessOutPort {

    private final BusinessMapper mapper;

    @Transactional
    @Override
    public List<BusinessRes> getBusinessList(BusinessReq req) {

        BusinessCardSearchEntity searchEntity = BusinessCardSearchEntity.builder().businessCardNm(req.getBusinessStdWordNm()).build();
        List<BusinessEntity> businessEntities = mapper.selectBusinessList(searchEntity);

       return businessEntities.stream()
               .map(entity -> BusinessRes.builder()
                       .businessName(entity.getBusinessName())
                       .businessCom(entity.getBusinessCom())
                       .build())
               .toList();
    }

    @Override
    public int insertRequestBusiness(BusinessAddReq req) {

        return 0;
    }
}
