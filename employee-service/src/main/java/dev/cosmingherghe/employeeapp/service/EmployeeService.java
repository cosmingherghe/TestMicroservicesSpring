package dev.cosmingherghe.employeeapp.service;

import dev.cosmingherghe.employeeapp.entity.Employee;
import dev.cosmingherghe.employeeapp.repository.EmployeeRepository;
import dev.cosmingherghe.employeeapp.response.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepo;

    public EmployeeResponse getEmployeeResponseById(Long id) {
        Employee employee = employeeRepo.findById(id).get();
        EmployeeResponse employeeResponse = EmployeeResponse.builder()
                .id(employee.getId())
                .name(employee.getName())
                .bloodgroup(employee.getBloodgroup())
                .build();
        return employeeResponse;
    }
}
