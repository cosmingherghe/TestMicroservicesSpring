package dev.cosmingherghe.addressapp.service;

import dev.cosmingherghe.addressapp.entity.Address;
import dev.cosmingherghe.addressapp.model.AddressResponse;
import dev.cosmingherghe.addressapp.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    AddressRepository addressRepo;

    @Override
    public AddressResponse findById(Long id) {
        Address address = addressRepo.findById(id).get();
        return AddressResponse.builder()
                .id(address.getId())
                .lane1(address.getLane1())
                .lane2(address.getLane2())
                .city(address.getCity())
                .state(address.getState())
                .postcode(address.getPostcode())
                .country(address.getCountry())
                .build();
    }
}
