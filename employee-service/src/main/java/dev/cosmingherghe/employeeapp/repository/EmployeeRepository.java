package dev.cosmingherghe.employeeapp.repository;

import dev.cosmingherghe.employeeapp.entity.Employee;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends ListCrudRepository<Employee, Long> {
}
