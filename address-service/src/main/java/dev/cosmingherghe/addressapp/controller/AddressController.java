package dev.cosmingherghe.addressapp.controller;

import dev.cosmingherghe.addressapp.model.AddressResponse;
import dev.cosmingherghe.addressapp.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    AddressService addressServ;

    @GetMapping("/{id}")
    public ResponseEntity<AddressResponse> getAddressById(@PathVariable("id") Long id){
        System.out.println(id);
        AddressResponse addressResponse = addressServ.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(addressResponse);
    }
}
