package com.github.patrickfrr.personapi.dto.mapper;


import com.github.patrickfrr.personapi.dto.request.PersonDTO;
import com.github.patrickfrr.personapi.entities.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}
