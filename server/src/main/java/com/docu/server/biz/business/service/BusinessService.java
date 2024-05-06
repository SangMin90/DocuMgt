package com.docu.server.biz.business.service;

import com.docu.server.biz.business.port.in.BusinessInPort;
import com.docu.server.biz.business.port.out.BusinessOutPort;
import com.docu.server.domain.common.ResponseMessage;
import com.docu.server.domain.business.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BusinessService implements BusinessInPort {

    private final BusinessOutPort businessOutPort;

    @Override
    public ResponseMessage getBusinessList(BusinessReq req) {
        ResponseMessage res;

        try {
            List<BusinessRes> buinsessLists = businessOutPort.getBusinessList(req);
            res = ResponseMessage.builder()
                    .data(businessLists)
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage("명함 조회완료")
                    .build();
        } catch (Exception e) {
            res = ResponseMessage.builder()
                    .data(null)
                    .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                    .resultMessage("명함 조회실패")
                    .build();
        }

        return res;

    }


    @Override
    public ResponseMessage addRequestBusiness(BusinessAddReq req) {
        ResponseMessage res;

        try {businessOutPort.insertRequestBusiness(req);
            res = ResponseMessage.builder()
                    .data(null)
                    .statusCode(HttpStatus.OK.value())
                    .resultMessage("명함 등록완료")
                    .build();
        } catch (Exception e) {
            res = ResponseMessage.builder()
                    .data(null)
                    .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                    .resultMessage("명함 등록실패")
                    .build();
        }

        return res;
    }

}
