package org.example.Mapper;

import org.example.dto.EmployeeDto;
import org.example.dto.JobDto;
import org.example.models.Employee;
import org.example.models.Job;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper (uses = {JobMapper.class}, componentModel = "cdi", imports = {java.util.UUID.class})
public interface EmployeeMapper {

//    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);
    @Mapping(source = "job", target = "job")
    EmployeeDto toEmpDto(Employee e);

//    @Mapping(source = "e.job_id", target = "job")
//    EmployeeDto toEmpDto(Employee e, Job j);

    @Mapping(source = "e.job", target = "job")
    Employee toModel(EmployeeDto e);




}
