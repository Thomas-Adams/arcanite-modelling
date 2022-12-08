package org.arcanite.idm.data.mapper.impl;

import org.arcanite.idm.data.dto.UserRoleDto;
import org.arcanite.idm.data.entity.UserRole;
import org.arcanite.idm.data.mapper.api.UserRoleMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UserRoleMapperImpl extends BaseMapperImpl<UserRole, UserRoleDto, Long> implements UserRoleMapper {

    @Override
    public Class<UserRole> getEntityClass() {
        return UserRole.class;
    }

    @Override
    public Class<UserRoleDto> getDtoClass() {
        return UserRoleDto.class;
    }

    @Autowired
    public UserRoleMapperImpl(ModelMapper modelMapper) {
        super(modelMapper);
    }
}

