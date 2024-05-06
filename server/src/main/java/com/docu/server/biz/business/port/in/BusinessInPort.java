package com.docu.server.biz.business.port.in;

import com.docu.server.domain.business.BusinessAddReq;
import com.docu.server.domain.business.BusinessReq;
import com.docu.server.domain.common.ResponseMessage;

public interface BusinessInPort {

    ResponseMessage getBusinessWordList(BusinessReq req);

    ResponseMessage addBusinessWord(BusinessAddReq req);
}
