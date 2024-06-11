package org.example.Mapper;

import org.example.dto.JobDto;
import org.example.models.Job;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface JobMapper {

    JobMapper INSTANCE = Mappers.getMapper(JobMapper.class);
    // target       //source
    JobDto toJobDto(Job job);

    Job toModel(JobDto dto);




}
