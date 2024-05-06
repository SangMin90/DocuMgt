package com.docu.server.adapter.out.persistence.business;

import com.docu.server.adapter.out.persistence.business.entity.BusinessCardSearchEntity;
import com.docu.server.biz.business.port.out.BusinessOutPort;
import com.docu.server.domain.business.*;
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

       return null;
    }

    @Override
    public int insertRequestBusiness(BusinessAddReq req) {

        return 0;
    }
}
