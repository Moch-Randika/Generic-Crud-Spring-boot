package com.example.serverside.repository.generic;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.serverside.models.baseEntity.BaseEntity;


public interface GenericRepository<T extends BaseEntity> extends JpaRepository<T,Long> {
    
}
