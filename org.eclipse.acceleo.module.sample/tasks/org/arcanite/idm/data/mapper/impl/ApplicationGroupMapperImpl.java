package org.arcanite.idm.data.mapper.impl;

import org.arcanite.idm.data.dto.ApplicationGroupDto;
import org.arcanite.idm.data.entity.ApplicationGroup;
import org.arcanite.idm.data.mapper.api.ApplicationGroupMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ApplicationGroupMapperImpl extends BaseMapperImpl<ApplicationGroup, ApplicationGroupDto, Long> implements ApplicationGroupMapper {

    @Override
    public Class<ApplicationGroup> getEntityClass() {
        return ApplicationGroup.class;
    }

    @Override
    public Class<ApplicationGroupDto> getDtoClass() {
        return ApplicationGroupDto.class;
    }

    @Autowired
    public ApplicationGroupMapperImpl(ModelMapper modelMapper) {
        super(modelMapper);
    }
}

