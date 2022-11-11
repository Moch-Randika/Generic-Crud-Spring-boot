package com.example.serverside.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.serverside.models.baseEntity.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "history")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class History extends BaseEntity{

    @Column(nullable = false)
    private Date start_date;

    @Column(nullable = false)
    private Date end_date;

   
    @ManyToOne
    private Departement departement;

   
    @ManyToOne
    private Employee employee;

   
    @ManyToOne
    private Job job;

}
