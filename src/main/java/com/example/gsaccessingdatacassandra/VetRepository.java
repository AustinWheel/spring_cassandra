package com.example.gsaccessingdatacassandra;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@EnableCassandraRepositories
public interface VetRepository extends CrudRepository<Vet, UUID> {
    Vet findByFirstName(String username);
}
