package com.urielnav.sample_inventory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepository extends JpaRepository<Sample, Long> {
    // Extender JPA para poder usar métodos como findAll, deleteById, etc
}