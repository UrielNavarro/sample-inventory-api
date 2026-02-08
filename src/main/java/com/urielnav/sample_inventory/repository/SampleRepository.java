package com.urielnav.sample_inventory.repository;

import com.urielnav.sample_inventory.model.SampleModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepository extends CrudRepository<SampleModel, Long> {
    // Extender CrudRepository para obtener operaciones CRUD automáticas usando Spring Data JPA
}
