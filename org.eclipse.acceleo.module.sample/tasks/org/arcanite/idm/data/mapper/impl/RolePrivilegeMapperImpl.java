package org.arcanite.idm.data.mapper.impl;

import org.arcanite.idm.data.dto.RolePrivilegeDto;
import org.arcanite.idm.data.entity.RolePrivilege;
import org.arcanite.idm.data.mapper.api.RolePrivilegeMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class RolePrivilegeMapperImpl extends BaseMapperImpl<RolePrivilege, RolePrivilegeDto, Long> implements RolePrivilegeMapper {

    @Override
    public Class<RolePrivilege> getEntityClass() {
        return RolePrivilege.class;
    }

    @Override
    public Class<RolePrivilegeDto> getDtoClass() {
        return RolePrivilegeDto.class;
    }

    @Autowired
    public RolePrivilegeMapperImpl(ModelMapper modelMapper) {
        super(modelMapper);
    }
}

