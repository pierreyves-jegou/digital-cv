package com.cgi.digitalcv.mapper;

import com.cgi.digitalcv.domain.Skill;
import com.cgi.digitalcv.dto.SkillDto;
import org.mapstruct.Mapper;

@Mapper
public interface SkillMapper {

    SkillDto toDto(Skill skill);

    Skill toDomain(SkillDto skillDto);

}
