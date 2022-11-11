package com.example.serverside.repository;

import org.springframework.stereotype.Repository;

import com.example.serverside.models.Region;
import com.example.serverside.repository.generic.GenericRepository;

@Repository
public interface RegionRepository extends GenericRepository<Region>{
    
}
