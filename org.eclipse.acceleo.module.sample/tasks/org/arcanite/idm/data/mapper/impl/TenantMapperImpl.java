package org.arcanite.idm.data.mapper.impl;

import org.arcanite.idm.data.dto.TenantDto;
import org.arcanite.idm.data.entity.Tenant;
import org.arcanite.idm.data.mapper.api.TenantMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class TenantMapperImpl extends BaseMapperImpl<Tenant, TenantDto, Long> implements TenantMapper {

    @Override
    public Class<Tenant> getEntityClass() {
        return Tenant.class;
    }

    @Override
    public Class<TenantDto> getDtoClass() {
        return TenantDto.class;
    }

    @Autowired
    public TenantMapperImpl(ModelMapper modelMapper) {
        super(modelMapper);
    }
}

