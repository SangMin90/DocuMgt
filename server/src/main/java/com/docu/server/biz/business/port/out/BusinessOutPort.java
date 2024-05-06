package com.docu.server.biz.business.port.out;

import com.docu.server.domain.business.*;

import java.util.List;

public interface BusinessOutPort {
    List<BusinessRes> getBusinessList(BusinessReq req);

    int insertRequestBusiness(BusinessAddReq req);
}