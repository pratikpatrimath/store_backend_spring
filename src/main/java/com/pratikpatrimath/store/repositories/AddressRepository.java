package com.pratikpatrimath.store.repositories;

import com.pratikpatrimath.store.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}