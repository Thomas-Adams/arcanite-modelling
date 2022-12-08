package org.arcanite.idm.data.mapper.impl;

import org.arcanite.idm.data.dto.GroupDto;
import org.arcanite.idm.data.entity.Group;
import org.arcanite.idm.data.mapper.api.GroupMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class GroupMapperImpl extends BaseMapperImpl<Group, GroupDto, Long> implements GroupMapper {

    @Override
    public Class<Group> getEntityClass() {
        return Group.class;
    }

    @Override
    public Class<GroupDto> getDtoClass() {
        return GroupDto.class;
    }

    @Autowired
    public GroupMapperImpl(ModelMapper modelMapper) {
        super(modelMapper);
    }
}

