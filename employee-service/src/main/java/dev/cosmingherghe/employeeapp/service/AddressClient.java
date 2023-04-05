package dev.cosmingherghe.employeeapp.service;

import dev.cosmingherghe.employeeapp.response.AddressResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "address", url = "${address.base.url}")
public interface AddressClient {
    @GetMapping("{id}")
    AddressResponse getAddressById(@PathVariable("id") Long id);
}
