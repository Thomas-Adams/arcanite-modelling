package org.arcanite.idm.data.mapper.impl;

import org.arcanite.idm.data.dto.ApplicationDto;
import org.arcanite.idm.data.entity.Application;
import org.arcanite.idm.data.mapper.api.ApplicationMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ApplicationMapperImpl extends BaseMapperImpl<Application, ApplicationDto, Long> implements ApplicationMapper {

    @Override
    public Class<Application> getEntityClass() {
        return Application.class;
    }

    @Override
    public Class<ApplicationDto> getDtoClass() {
        return ApplicationDto.class;
    }

    @Autowired
    public ApplicationMapperImpl(ModelMapper modelMapper) {
        super(modelMapper);
    }
}

