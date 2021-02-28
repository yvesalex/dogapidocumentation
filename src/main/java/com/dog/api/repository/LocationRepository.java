package com.dog.api.repository;

import com.dog.api.entity.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location, Long> {
}
