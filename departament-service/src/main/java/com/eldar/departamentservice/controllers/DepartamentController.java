package com.eldar.departamentservice.controllers;

import com.eldar.departamentservice.models.response.ExampleDto;
import com.eldar.departamentservice.services.contracts.DepartamentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/departament")
public class DepartamentController {

    private final DepartamentService departamentService;

    @GetMapping("/comunicate")
    public ResponseEntity<ExampleDto> comunicate() {
        log.info("Entro a DepartamentController.comunicate()");
        return ResponseEntity.ok(departamentService.comunicate());
    }

}
