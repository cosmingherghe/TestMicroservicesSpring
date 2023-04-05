package dev.cosmingherghe.employeeapp.service;

import dev.cosmingherghe.employeeapp.entity.Employee;
import dev.cosmingherghe.employeeapp.repository.EmployeeRepository;
import dev.cosmingherghe.employeeapp.response.AddressResponse;
import dev.cosmingherghe.employeeapp.response.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepo;
    @Autowired
    private AddressClient addressClient;

    @Value("${address.base.url}")
    private String addressBaseUrl;

    @Override
    public EmployeeResponse getEmployeeResponseById(Long id) {
        Employee employee = employeeRepo.findById(id).orElse(null);
        if(employee == null) return null;
        AddressResponse addressResponse = addressClient.getAddressById(employee.getAddressId());
        return EmployeeResponse.builder()
                .id(employee.getId())
                .name(employee.getName())
                .bloodgroup(employee.getBloodgroup())
                .addressResponse(addressResponse)
                .build();
    }
}
