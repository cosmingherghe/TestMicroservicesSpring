package dev.cosmingherghe.employeeapp.controller;

import dev.cosmingherghe.employeeapp.exceptions.UserNotFoundException;
import dev.cosmingherghe.employeeapp.response.EmployeeResponse;
import dev.cosmingherghe.employeeapp.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeServiceImpl employeeServ;

    @GetMapping("/employee/{id}")
    public ResponseEntity<EmployeeResponse> getEmployeeDetails(@PathVariable("id") Long id) {
        EmployeeResponse employeeResponse = employeeServ.getEmployeeResponseById(id);
        if(employeeResponse == null) throw new UserNotFoundException("id: " + id);
        return ResponseEntity.status(HttpStatus.OK).body(employeeResponse);
    }
}
