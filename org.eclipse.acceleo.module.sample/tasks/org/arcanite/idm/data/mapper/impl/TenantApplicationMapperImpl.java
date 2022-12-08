package org.arcanite.idm.data.mapper.impl;

import org.arcanite.idm.data.dto.TenantApplicationDto;
import org.arcanite.idm.data.entity.TenantApplication;
import org.arcanite.idm.data.mapper.api.TenantApplicationMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class TenantApplicationMapperImpl extends BaseMapperImpl<TenantApplication, TenantApplicationDto, Long> implements TenantApplicationMapper {

    @Override
    public Class<TenantApplication> getEntityClass() {
        return TenantApplication.class;
    }

    @Override
    public Class<TenantApplicationDto> getDtoClass() {
        return TenantApplicationDto.class;
    }

    @Autowired
    public TenantApplicationMapperImpl(ModelMapper modelMapper) {
        super(modelMapper);
    }
}

