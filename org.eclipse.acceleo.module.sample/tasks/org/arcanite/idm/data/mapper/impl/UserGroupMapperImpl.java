package org.arcanite.idm.data.mapper.impl;

import org.arcanite.idm.data.dto.UserGroupDto;
import org.arcanite.idm.data.entity.UserGroup;
import org.arcanite.idm.data.mapper.api.UserGroupMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UserGroupMapperImpl extends BaseMapperImpl<UserGroup, UserGroupDto, Long> implements UserGroupMapper {

    @Override
    public Class<UserGroup> getEntityClass() {
        return UserGroup.class;
    }

    @Override
    public Class<UserGroupDto> getDtoClass() {
        return UserGroupDto.class;
    }

    @Autowired
    public UserGroupMapperImpl(ModelMapper modelMapper) {
        super(modelMapper);
    }
}

