package com.eldar.employeeservice.services.impl;

import com.eldar.employeeservice.models.response.ExampleDto;
import com.eldar.employeeservice.services.contracts.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    public ExampleDto comunicate() {
        return ExampleDto.builder().message("Hola desde el servicio de empleados").build();
    }
}
