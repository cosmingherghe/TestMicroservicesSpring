package dev.cosmingherghe.employeeapp.controller;

import dev.cosmingherghe.employeeapp.entity.Employee;
import dev.cosmingherghe.employeeapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepo;

    @GetMapping("/employee/{id}")
    public String getEmployeeDetails(@PathVariable("id") String id) {
        return  employeeRepo.findById(Long.valueOf(id)).isPresent() ?
                employeeRepo.findById(Long.valueOf(id)).get().toString() :
                "Employee Not Found ID: " + id;
    }
}
