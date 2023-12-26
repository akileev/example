package org.example.mapper;


public interface BaseMapper<Entity, Dto> {
    Dto toDto(Entity entity);
    Entity toEntity(Dto dto);
}
