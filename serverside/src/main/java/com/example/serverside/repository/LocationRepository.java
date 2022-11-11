package com.example.serverside.repository;

import org.springframework.stereotype.Repository;

import com.example.serverside.models.Location;
import com.example.serverside.repository.generic.GenericRepository;
  
@Repository
public interface LocationRepository extends GenericRepository<Location>{
    
}
