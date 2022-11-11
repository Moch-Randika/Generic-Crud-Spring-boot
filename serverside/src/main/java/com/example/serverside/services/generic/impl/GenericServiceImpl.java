package com.example.serverside.services.generic.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.example.serverside.models.baseEntity.BaseEntity;
import com.example.serverside.repository.generic.GenericRepository;
import com.example.serverside.services.generic.GenericService;

public class GenericServiceImpl<T extends BaseEntity> implements GenericService<T> {

    @Autowired
    private GenericRepository<T> genericRepository;

    @Override
    public T delete(Long id) {
        T data = findById(id);
    genericRepository.delete(data);
    return data;
        
    }

    @Override
    public List<T> findAll() {
     return genericRepository.findAll();
    }

    @Override
    public T save( T entity) {
      
        return genericRepository.save(entity);
    }

    @Override
    public T findById(Long id) {
        return genericRepository.findById(id).orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Data Not Found!") );
    }
    
}
