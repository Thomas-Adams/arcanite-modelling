package org.arcanite.idm.data.mapper.impl;

import org.arcanite.idm.data.dto.UserDto;
import org.arcanite.idm.data.entity.User;
import org.arcanite.idm.data.mapper.api.UserMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UserMapperImpl extends BaseMapperImpl<User, UserDto, Long> implements UserMapper {

    @Override
    public Class<User> getEntityClass() {
        return User.class;
    }

    @Override
    public Class<UserDto> getDtoClass() {
        return UserDto.class;
    }

    @Autowired
    public UserMapperImpl(ModelMapper modelMapper) {
        super(modelMapper);
    }
}

