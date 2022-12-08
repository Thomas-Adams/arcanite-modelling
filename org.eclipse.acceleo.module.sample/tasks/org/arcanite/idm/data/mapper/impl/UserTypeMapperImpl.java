package org.arcanite.idm.data.mapper.impl;

import org.arcanite.idm.data.dto.UserTypeDto;
import org.arcanite.idm.data.entity.UserType;
import org.arcanite.idm.data.mapper.api.UserTypeMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UserTypeMapperImpl extends BaseMapperImpl<UserType, UserTypeDto, Long> implements UserTypeMapper {

    @Override
    public Class<UserType> getEntityClass() {
        return UserType.class;
    }

    @Override
    public Class<UserTypeDto> getDtoClass() {
        return UserTypeDto.class;
    }

    @Autowired
    public UserTypeMapperImpl(ModelMapper modelMapper) {
        super(modelMapper);
    }
}

