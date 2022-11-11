package com.example.serverside.services.generic;

import java.util.List;

import com.example.serverside.models.baseEntity.BaseEntity;

public interface GenericService<T extends BaseEntity> {
    
    List<T> findAll();
	T save(T entity);
	T delete(Long id);
    T findById(Long id);
}
