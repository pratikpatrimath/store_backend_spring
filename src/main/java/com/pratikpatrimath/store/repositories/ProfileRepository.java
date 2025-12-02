package com.pratikpatrimath.store.repositories;

import com.pratikpatrimath.store.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
}