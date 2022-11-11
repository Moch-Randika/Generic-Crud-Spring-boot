package com.example.serverside.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.serverside.models.baseEntity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "job")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Job extends BaseEntity{
    
    @Column(nullable = false)
    private String title;

    @Column(nullable = true)
    private Long min_salary;

    @Column(nullable = true)
    private Long max_salary;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "job" , cascade = CascadeType.ALL)
    private List<Employee> jobs;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "job", cascade = CascadeType.ALL )
    private List<History> histories;
}
