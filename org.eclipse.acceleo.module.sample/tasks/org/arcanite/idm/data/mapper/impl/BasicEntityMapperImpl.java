package org.arcanite.idm.data.mapper.impl;

import org.arcanite.idm.data.dto.BasicEntityDto;
import org.arcanite.idm.data.entity.BasicEntity;
import org.arcanite.idm.data.mapper.api.BasicEntityMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class BasicEntityMapperImpl extends BaseMapperImpl<BasicEntity, BasicEntityDto, Long> implements BasicEntityMapper {

    @Override
    public Class<BasicEntity> getEntityClass() {
        return BasicEntity.class;
    }

    @Override
    public Class<BasicEntityDto> getDtoClass() {
        return BasicEntityDto.class;
    }

    @Autowired
    public BasicEntityMapperImpl(ModelMapper modelMapper) {
        super(modelMapper);
    }
}

