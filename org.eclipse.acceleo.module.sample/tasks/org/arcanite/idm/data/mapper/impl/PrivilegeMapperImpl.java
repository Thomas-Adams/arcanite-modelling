package org.arcanite.idm.data.mapper.impl;

import org.arcanite.idm.data.dto.PrivilegeDto;
import org.arcanite.idm.data.entity.Privilege;
import org.arcanite.idm.data.mapper.api.PrivilegeMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class PrivilegeMapperImpl extends BaseMapperImpl<Privilege, PrivilegeDto, Long> implements PrivilegeMapper {

    @Override
    public Class<Privilege> getEntityClass() {
        return Privilege.class;
    }

    @Override
    public Class<PrivilegeDto> getDtoClass() {
        return PrivilegeDto.class;
    }

    @Autowired
    public PrivilegeMapperImpl(ModelMapper modelMapper) {
        super(modelMapper);
    }
}

