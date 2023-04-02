package dev.cosmingherghe.employeeapp.controller;

import dev.cosmingherghe.employeeapp.entity.Employee;
import dev.cosmingherghe.employeeapp.repository.EmployeeRepository;
import dev.cosmingherghe.employeeapp.response.EmployeeResponse;
import dev.cosmingherghe.employeeapp.service.EmployeeService;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeServ;

    @GetMapping("/employee/{id}")
    public ResponseEntity<EmployeeResponse> getEmployeeDetails(@PathVariable("id") String id) {
        EmployeeResponse employeeResponse = employeeServ.getEmployeeResponseById(Long.valueOf(id));
        return ResponseEntity.status(HttpStatus.OK).body(employeeResponse);
    }
}
