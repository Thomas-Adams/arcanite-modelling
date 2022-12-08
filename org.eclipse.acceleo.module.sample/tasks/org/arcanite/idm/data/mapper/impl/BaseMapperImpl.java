
package org.arcanite.idm.data.mapper.impl;

import org.arcanite.idm.data.dto.BaseDto;
import org.arcanite.idm.data.entities.BaseEntity;
import org.arcanite.idm.data.mapper.api.BaseMapper;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class BaseMapperImpl<B extends BaseEntity<ID>, D extends BaseDto<ID>, ID extends Serializable> implements BaseMapper<B,D,ID> {

    protected final ModelMapper modelMapper;

    public abstract Class<B> getEntityClass();

    public abstract Class<D> getDtoClass();

    public BaseMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public B convertToEntity(D dto) {
        return modelMapper.map(dto, getEntityClass());
    }

    @Override
    public List<B> convertToEntityList(List<D> dtos) {
        return dtos.stream().map( d -> modelMapper.map(d,getEntityClass())).collect(Collectors.toList());
    }

    @Override
    public Set<B> convertToEntitySet(Set<D> dtos) {
        return dtos.stream().map( d -> modelMapper.map(d,getEntityClass())).collect(Collectors.toSet());
    }

    @Override
    public Page<B> convertToEntityPage(Page<D> dtoPage) {
        List<B> entities = dtoPage.getContent().stream().map(d -> modelMapper.map(d,getEntityClass())).collect(Collectors.toList());
        return new PageImpl<>(entities, dtoPage.getPageable(), dtoPage.getTotalPages());
    }

    @Override
    public D convertToDTO(B entity) {
        return modelMapper.map(entity, getDtoClass());
    }

    @Override
    public List<D> convertToDTOList(List<B> entities) {
        return entities.stream().map( d -> modelMapper.map(d,getDtoClass())).collect(Collectors.toList());
    }

    @Override
    public Set<D> convertToDTOSet(Set<B> entities) {
        return entities.stream().map( d -> modelMapper.map(d,getDtoClass())).collect(Collectors.toSet());
    }

    @Override
    public Page<D> convertToDTOPage(Page<B> entityPage) {
        List<D> dtos = entityPage.getContent().stream().map(d -> modelMapper.map(d,getDtoClass())).collect(Collectors.toList());
        return new PageImpl<>(dtos, entityPage.getPageable(), entityPage.getTotalPages());
    }

    @Override
    public Optional<D> convertToDtoOptional(Optional<B> entity) {
        return entity.map(d -> modelMapper.map(d, getDtoClass()));
    }
    @Override
    public Optional<B> convertToEntityOptional(Optional<D> dto) {
        return dto.map(d -> modelMapper.map(d, getEntityClass()));
    }
}
