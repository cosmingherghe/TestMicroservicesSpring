package dev.cosmingherghe.employeeapp.service;

import dev.cosmingherghe.employeeapp.entity.Employee;
import dev.cosmingherghe.employeeapp.repository.EmployeeRepository;
import dev.cosmingherghe.employeeapp.response.AddressResponse;
import dev.cosmingherghe.employeeapp.response.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepo;

    @Autowired
    RestTemplate restTemplate;

    public EmployeeResponse getEmployeeResponseById(Long id) {
        Employee employee = employeeRepo.findById(id).get();
        String url = "http://localhost:8082/address-app/api/v1/address/";
        AddressResponse addressResponse = getAddressResponse(employee, url);
        return EmployeeResponse.builder()
                .id(employee.getId())
                .name(employee.getName())
                .bloodgroup(employee.getBloodgroup())
                .addressResponse(addressResponse)
                .build();
    }

    private AddressResponse getAddressResponse(Employee employee, String url) {
        AddressResponse addressResponse = restTemplate.getForObject(url +"{id}", AddressResponse.class, employee.getAddressId());
        return addressResponse;
    }
}
