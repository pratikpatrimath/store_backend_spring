package com.pratikpatrimath.store.repositories;

import com.pratikpatrimath.store.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
