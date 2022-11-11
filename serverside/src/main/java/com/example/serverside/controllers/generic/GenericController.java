package com.example.serverside.controllers.generic;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.serverside.models.baseEntity.BaseEntity;

public interface GenericController<T extends BaseEntity> {

    ResponseEntity<Object> save(@RequestBody T entity);
	
	ResponseEntity<List<T>> findAll();
	
	ResponseEntity<Object> delete(@PathVariable Long id);

    ResponseEntity<Object> findById(@PathVariable Long id);
}
