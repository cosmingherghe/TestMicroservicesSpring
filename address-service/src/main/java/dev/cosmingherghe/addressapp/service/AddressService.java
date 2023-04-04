package dev.cosmingherghe.addressapp.service;

import dev.cosmingherghe.addressapp.entity.Address;
import dev.cosmingherghe.addressapp.model.AddressResponse;

import java.util.Optional;

public interface AddressService {
    AddressResponse findByEmployeeId(Long id);
}
