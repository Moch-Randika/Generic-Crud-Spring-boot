package com.example.serverside.controllers.generic.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.serverside.controllers.generic.GenericController;
import com.example.serverside.models.baseEntity.BaseEntity;
import com.example.serverside.services.generic.GenericService;

@SuppressWarnings({ "unchecked", "rawtypes" })
@ResponseBody
public class GenericControllerImpl<T extends BaseEntity> implements GenericController<T> {

    @Autowired
    private GenericService<T> genericService;

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(Long id) {
    return new ResponseEntity(genericService.delete(id),HttpStatus.OK);

    }

    @Override
    @GetMapping
    public ResponseEntity<List<T>> findAll() {
    return new ResponseEntity(genericService.findAll(),HttpStatus.OK);
    }

    @Override
    @PostMapping
    public ResponseEntity<Object> save(T entity) {
    return new ResponseEntity(genericService.save(entity),HttpStatus.CREATED);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(Long id) {
    return new ResponseEntity(genericService.findById(id), HttpStatus.OK);
    }
    
}
