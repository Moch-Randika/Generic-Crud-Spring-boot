package com.example.serverside.repository;

import org.springframework.stereotype.Repository;

import com.example.serverside.models.Country;
import com.example.serverside.repository.generic.GenericRepository;

@Repository
public interface CountryRepository extends GenericRepository<Country> {
    
}
