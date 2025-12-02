package com.pratikpatrimath.store.repositories;

import com.pratikpatrimath.store.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Byte> {
}