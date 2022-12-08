package org.arcanite.idm.data.mapper.impl;

import org.arcanite.idm.data.dto.RoleDto;
import org.arcanite.idm.data.entity.Role;
import org.arcanite.idm.data.mapper.api.RoleMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class RoleMapperImpl extends BaseMapperImpl<Role, RoleDto, Long> implements RoleMapper {

    @Override
    public Class<Role> getEntityClass() {
        return Role.class;
    }

    @Override
    public Class<RoleDto> getDtoClass() {
        return RoleDto.class;
    }

    @Autowired
    public RoleMapperImpl(ModelMapper modelMapper) {
        super(modelMapper);
    }
}

