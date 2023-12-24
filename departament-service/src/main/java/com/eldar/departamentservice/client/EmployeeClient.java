package com.eldar.departamentservice.client;

import com.eldar.departamentservice.models.response.ExampleDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface EmployeeClient {

    @GetExchange("/employee/comunicate")
    ExampleDto comunicate();
}
