package dev.cosmingherghe.employeeapp.controller;

import dev.cosmingherghe.employeeapp.entity.Employee;
import dev.cosmingherghe.employeeapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepo;

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployeeDetails(@PathVariable("id") String id) {
        Employee employee = employeeRepo.findById(Long.valueOf(id)).get();
        return ResponseEntity.status(HttpStatus.OK).body(employee);
    }
}
