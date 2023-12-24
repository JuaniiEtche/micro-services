package com.eldar.departamentservice.services.impl;

import com.eldar.departamentservice.client.EmployeeClient;
import com.eldar.departamentservice.models.response.ExampleDto;
import com.eldar.departamentservice.services.contracts.DepartamentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class DepartamentServiceImpl implements DepartamentService {
    private final EmployeeClient employeeClient;

    public ExampleDto comunicate() {

        return employeeClient.comunicate();
    }
}
