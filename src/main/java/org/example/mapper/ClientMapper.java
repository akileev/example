package org.example.mapper;

import org.example.domain.Client;
import org.example.model.ClientDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ClientMapper extends BaseMapper<Client, ClientDto> {
}
