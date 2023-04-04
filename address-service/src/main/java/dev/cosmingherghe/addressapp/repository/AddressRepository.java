package dev.cosmingherghe.addressapp.repository;


import dev.cosmingherghe.addressapp.entity.Address;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepository extends ListCrudRepository<Address, Long> {
    Address findByEmployeeId(Long id);
}
