package dev.cosmingherghe.employeeapp.service;

import dev.cosmingherghe.employeeapp.response.EmployeeResponse;

public interface EmployeeService {
    EmployeeResponse getEmployeeResponseById(Long id);
}
