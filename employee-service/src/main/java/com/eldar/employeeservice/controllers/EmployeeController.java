package com.eldar.employeeservice.controllers;

import com.eldar.employeeservice.models.response.ExampleDto;
import com.eldar.employeeservice.services.contracts.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/comunicate")
    public ResponseEntity<ExampleDto> comunicate() {
        log.info("Entro a EmployeeController.comunicate()");
        return ResponseEntity.ok(employeeService.comunicate());
    }
}
