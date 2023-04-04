package dev.cosmingherghe.addressapp.repository;


import dev.cosmingherghe.addressapp.entity.Address;
import org.springframework.data.repository.ListCrudRepository;

public interface AddressRepository extends ListCrudRepository<Address, Long> {
}
