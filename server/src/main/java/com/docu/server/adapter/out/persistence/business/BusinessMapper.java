package com.docu.server.adapter.out.persistence.business;

import com.docu.server.adapter.out.persistence.business.entity.BusinessEntity;
import com.docu.server.adapter.out.persistence.business.entity.BusinessCardSearchEntity;
import com.docu.server.config.annotation.MapperInterface;

import java.util.List;

@MapperInterface
public interface BusinessMapper {
    List<BusinessEntity> selectBusinessList(BusinessCardSearchEntity entity);

    int insertBusinessWord(BusinessEntity entity);

    int exists(BusinessEntity entity);
}
